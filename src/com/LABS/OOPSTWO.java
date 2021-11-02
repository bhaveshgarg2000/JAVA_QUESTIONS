package com.LABS;
class OopsTwo {
    public static void main(String[] args) {
        System.out.println("Enter Expression : ");
        int result;
        if(args.length == 3){
            if(args[1].equals("+")){
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            }else if(args[1].equals("-")){
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
            }else if(args[1].equals("*")){
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
            }else if(args[1].equals("/")){
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
            }else{
                throw new InvalidOperatorException("Invalid operator!");
            }
            if(result < 0){
                throw new NegativeResultException("Negative result!");
            }
        }else{
            throw new illegalNumberOfArguments("illegal no of arguments");
        }

        System.out.println(result);
    }
}
class illegalNumberOfArguments extends ArithmeticException{
    public illegalNumberOfArguments(String error){
        super(error);
    }
}
class InvalidOperatorException extends ArithmeticException{
    public InvalidOperatorException(String error){
        super(error);
    }
}
class NegativeResultException extends ArithmeticException{
    public NegativeResultException(String error){
        super(error);
    }
}


