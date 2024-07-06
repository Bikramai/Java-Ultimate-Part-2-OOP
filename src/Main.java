//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
    }
}

// Note :-
// Primitive types are numbers, Boolean, and characters.
// Reference types are Everything else reference type.

// Back to our text box class. This text field is a string object.
// Strings are reference types. And By default, if we don't initialize
// these reference types, they're set Null. This null can be dangerous,
// and they can crash our programs.

// So we can see that these objects are completely independent of each
// other. They have different data, they're in different states.
// Here we can see the state of the first text box.
// And below that we can see the state or the data in the second text box.