public class Program{
    public static void Main(string[] args){
        //Conversão implícita
        int numInt = 45;
        double numDouble = numInt;
        Console.WriteLine("Conversão implícita de int para double:");
        Console.WriteLine($"Int: {numInt}, Double: {numDouble}");

        //Conversão usando o Convert
        double valorDouble = 7.6;
        int valorConvertidoInt = Convert.ToInt32(valorDouble);
        string textoValor = "123";
        int textoConvertidoInt = Convert.ToInt32(textoValor);
        Console.WriteLine($"Double: {valorDouble}, Inteiro: {valorConvertidoInt}");
        Console.WriteLine($"String: {textoValor}, Inteiro: {textoConvertidoInt}");

        //Conversão explícita usando o (casting)
        double x = 9.75;
        int a = (int)x;
        Console.WriteLine($"Double: {x}, Inteiro: {a}");

        //Conversão usando Parse
        string textDecimal = "12.75";
        double decimalString = double.Parse(textDecimal);
        Console.WriteLine($"String: {textDecimal}, Double: {decimalString}");

        char caractere = 'A';
        int codigoAscii = (int)caractere;
        Console.WriteLine($"Char: {caractere}, Ascii: {codigoAscii}");
    }
}