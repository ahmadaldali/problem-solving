process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solve(data) {
    const D = BigInt(data[0]);
    const [Oc, Of, Od] = data[1].split(" ").map((char)=> BigInt(char));
    const [Cs, Cb, Cm, Cd] = data[2].split(" ").map((char)=> BigInt(char));
 
    const onlineCost = Oc + (D-Of) * Od;
    const classicCost = Cb + (D*Cd) + Cm*(BigInt(parseInt(D/Cs)))
 
    if (onlineCost <= classicCost) {
        console.log("Online Taxi")
    } else {
        console.log("Classic Taxi")
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
