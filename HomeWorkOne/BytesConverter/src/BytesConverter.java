public class BytesConverter {
    public static void main(String[] args) {
        long totalBytes = 254318501496L;
        //1 KB = 1024 B
//        1 MB = 1024 KB
//        1 GB = 1024 MB
        long gigaBytes = totalBytes/1024/1024/1024%1024;
        long megaBytes = totalBytes/1024/1024%1024;
        long kiloBytes = totalBytes/1024%1024;
        long justBytes = totalBytes%1024;
        System.out.println(gigaBytes + "GB," +  megaBytes + "MB," +  kiloBytes + "KB," +  justBytes + "B.");
        // должно получиться 236 GB, 873 MB, 23 KB, 632 B

    }
}
