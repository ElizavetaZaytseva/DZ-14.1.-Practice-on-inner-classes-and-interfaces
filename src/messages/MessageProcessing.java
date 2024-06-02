package messages;

 class Message {
    private String text;
    private String sender;

    public Message(String text, String sender) {
        this.text = text;
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}

class MessageProcessing implements Printer {

    //Якщо поле sender в повідомленні пусте або null,
    // то вивести текст: "Анонімний користувач відправив
    // повідомлення: <текст повідомлення тут>"
    //Якщо поле sender присутнє, виводити "Користувач <sender>
    // відправив повідомлення: <текст повідомлення тут>"
    //Якщо обидва поля text та sender пусті (null),
    // створити анонімний клас, що буде обробляти таке
    // пусте повідомлення і друкувати в консоль:
    // "Опрацьовується пусте повідомлення від анонімного користувача..."

    public void print(Message message) {
        if ((message.getSender() == null || message.getSender().trim().isEmpty())
                && (message.getText()!=null&&!message.getText().trim().isEmpty())) {
               System.out.println("An anonymous sender sent notification: " + message.getText());


         } else if ((message.getText() == null || message.getText().trim().isEmpty())
               && (message.getSender() == null|| message.getSender().trim().isEmpty())) {
      //  } else if (message.getText().isEmpty()&&(message.getSender().isEmpty())){
//                ||message.getSender() == null&&  message.getSender().isEmpty())) {
            Printer printer = new Printer() {
                @Override
                public void print(Message message) {
                   System.out.println("Empty message from anonymous user in progress...");
                }
            };
         printer.print(message);
       } else {
            System.out.println("Sender " + message.getSender() + " sent a message: " + message.getText());
       }
  }
}







