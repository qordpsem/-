package com.example.myapplication

fun main(){

    var num1 = readLine()!!.toDouble() // 숫자1
    var oper = readLine().toString() //사칙연산 기호
    var num2 = readLine()!!.toDouble() // 숫자2

    var cal = Calculator() //cal는 Calculator 클래스의 별명. 사용하기위해 만든 이름.
    if(oper== "+"){ println(cal.plus(AddOperation(),num1,num2))}
    else if(oper== "-"){ println(cal.minus(SubstractOperation(),num1,num2))}
    else if(oper== "/"){ println(cal.divide(DivideOperation(),num1,num2))}
    else if(oper== "*"){ println(cal.multiple(MultiplyOperation(),num1,num2))}
    else if(oper== "%"){ println(cal.mod(num1,num2))}
}

class Calculator {
    fun plus(add:AddOperation , num1 : Double, num2 : Double) : Double{
        return add.plus (num1,num2)}
    fun minus(sub:SubstractOperation, num1 : Double, num2 : Double) : Double{
        return sub.minus (num1,num2)}
    fun divide(div:DivideOperation, num1 : Double, num2 : Double) : Double{
        return div.divide (num1,num2)}
    fun multiple(mul:MultiplyOperation, num1 : Double, num2 : Double) : Double{
        return mul.multiple(num1,num2)}
    fun mod(num1 : Double, num2 : Double) : Double{return num1%num2}
}

    class AddOperation {
        fun plus(num1: Double, num2: Double): Double {
            return num1 + num2
        }
    }
    class SubstractOperation {
        fun minus(num1: Double, num2: Double): Double {
            return num1 - num2
        }
    }

    class DivideOperation {
        fun divide(num1: Double, num2: Double): Double {
            return num1/ num2
        }
    }

    class MultiplyOperation {
        fun multiple(num1: Double, num2: Double): Double {
            return num1 * num2
        }
    }
