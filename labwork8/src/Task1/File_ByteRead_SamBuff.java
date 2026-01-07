package Task1;

import java.io.*;
import java.util.Arrays;

public class File_ByteRead_SamBuff {

    // Чтение по 5 символов (буфер)
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) { // если не конец файла
                System.out.println("количество = " + count + ", buff = "
                        + Arrays.toString(buff) + ", str = "
                        + new String(buff, 0, count, "cp1251")); //"UTF8"
            } else {
                break; // данные буфера преобразовываются в строку
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "E:\\MyFile1.txt"; // переменная объявляется до секции try
        InputStream inFile = null; // чтобы не ограничивать область видимости

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);

        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла " + fileName + e);
        } finally { // корректное закрытие потока
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /* NOP */ // <<No Operation>> -- ничего не делать
                }
            }
        }
    }
}