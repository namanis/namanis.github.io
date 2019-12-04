package com.alpi.niofile;



import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
// To illustrate important methods such as normalize(), toAbsolutePath(), and toRealPath()
class PathInfo2 {
public static void main(String[] args) throws IOException {
// get a path object with relative path
//PathdirName testFilePath = Paths.get(".\\Test");
Path  testFilePath= Paths.get("C:\\Users\\Namag\\workspace\\JavaLearn\\Test");
Path resolvedPath = testFilePath.resolve("Test");
System.out.println(resolvedPath);
System.out.println("The file name is: " + testFilePath.getFileName());
System.out.println("Its URI is: " + testFilePath.toUri());
System.out.println("Its absolute path is: " + testFilePath.toAbsolutePath());
System.out.println("Its normalized path is: " + testFilePath.normalize());
// get another path object with normalized relative path
Path testPathNormalized = Paths.get(testFilePath.normalize().toString());
System.out.println("Its normalized absolute path is: " +
testPathNormalized.toAbsolutePath());
System.out.println("Its normalized real path is: " +
testFilePath.toRealPath (LinkOption.NOFOLLOW_LINKS));
}
}