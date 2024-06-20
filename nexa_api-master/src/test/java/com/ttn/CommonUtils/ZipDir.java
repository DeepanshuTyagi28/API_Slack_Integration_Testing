package com.ttn.CommonUtils;

import java.io.*;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.*;
import java.nio.file.attribute.*;

/**
 * This Java program demonstrates how to compress a directory in ZIP format.
 *
 * @author TTN
 */
public class ZipDir extends SimpleFileVisitor<Path> {
	private static ZipOutputStream zos;
	private Path sourceDir;

	private static final Logger LOGGER = Logger.getLogger(ZipDir.class.getName());

	public ZipDir(Path sourceDir) {
		this.sourceDir = sourceDir;
		LOGGER.log(Level.INFO, "== Path for file compresss :" + sourceDir);

	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
		try {
			Path targetFile = sourceDir.relativize(file);
			zos.putNextEntry(new ZipEntry(targetFile.toString()));
			byte[] bytes = Files.readAllBytes(file);
			zos.write(bytes, 0, bytes.length);
			zos.closeEntry();
		} catch (IOException ex) {

		}
		return FileVisitResult.CONTINUE;
	}

	public static void zip(String dirPath) {
		Path sourceDir = Paths.get(dirPath);
		try {
			String zipFileName = dirPath.concat(".zip");
			zos = new ZipOutputStream(new FileOutputStream(zipFileName));
			zos.setLevel(Deflater.BEST_COMPRESSION); // Set best compression level

			Files.walkFileTree(sourceDir, new ZipDir(sourceDir));
			zos.close();

			// Set a fixed timestamp for all ZIP entries (current time used here)
			File zipFile = new File(zipFileName);
			zipFile.setLastModified(System.currentTimeMillis());
			LOGGER.log(Level.INFO, "== File compression is done");

		} catch (IOException ex) {
			LOGGER.log(Level.WARNING, ex.getMessage());
		}
	}
}
