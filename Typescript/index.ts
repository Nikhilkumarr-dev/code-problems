import { StringLiteral } from "typescript";
import { defaultExternalConditions } from "vite";

let variable ="hello"
let age=18
let ageWithType:number;

let testStringOrNumber:string | number
testStringOrNumber=10
testStringOrNumber="10"

//ARRAy
let names=["john","jane","tom"];
names.push("mike");

let testStringArray:string[]
testStringArray=["djklasj","jdsflkajl"]

let testStringOrNumberArray:(string | number)[]
testStringOrNumberArray=[1,"two"]

//objects

let user={
    username:"john",
    age:22,
    isAdmin:false
}
user.username="jane";
user.isAdmin=true;

let userObjects:{
    username:String
    age:number
    isAdmin:boolean
}
userObjects={
    username:"john",
    age:23,
    isAdmin:true
}
console.log(userObjects);


let userObjects2:{
    username:String
    age:number
    isAdmin:boolean
    phone?:string
}

//ANY
let testAnyArray:any[];

testAnyArray=[1,"two",false,[]];


// FUNCTIONS

let sayHi=()=>{
    console.log("hi,welcome")
}
// sayHi="hi"


let fucntionReturnString=():string=>{
    console.log("hiii")
    return "lama nikhil"
}

let multiple=(num:number):number=>{
    return num*2;
}

let sum =(num1:number,num2:number,another?:number)=>{
    return num1+num2;
};
sum(3,3)

let func =(user:{username:string,age:number,phone?:string})=>{
    console.log(age)
};


//Type Aliases
type UserType={
    username:string,
    age:number,
    phone?:string
}

let betterFunction =(user:UserType)=>{
    console.log(user.age);
}

type myFunc =(a:number,b:string)=>void
let write:myFunc=(num,str)=>{
    console.log(num+"times"+str);
}
write(2,"dfjsalkd");

type UserType2={
    username:string;
    age:number;
    phone?:string;
    theme:"dark"|"light"
}

const userWithTheme:UserType2={
    username:"john",
    age:43,
    //theme
    theme:"dark",
}

//INTERFACES

interface IUser{
    username:string;
    email:string;
    age:number;
}

interface IEmployee extends IUser{
    employeeId:number
}


const emp:IEmployee={
    username:"tomp",
    email:"dsjlkasdjkl@gamil",
    age:43,
    employeeId:1,
}

interface IAuthor{
    id:number,
    username:string
}
interface ICategory{
    id:number;
    title:string;
}
//Generics
interface IPost{
    id:number;
    title:string;
    desc:string;
    extra:IAuthor[] | ICategory[];
}

interface IPostBetter<T>{
    id:number,
    title:string;
    desc:string;
    extra:T[]
}

const testMe:IPostBetter<String>={
    id:1,
    title:"post title",
    desc:"post description",
    extra:["str","str"]
}
