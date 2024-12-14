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
    const vowels = ['a', 'e' , 'i', 'o', 'u'];
    const S = data[1].split("");
 
    for(let i=0; i<vowels.length; i++) {
        if (!S.includes(vowels[i])) {
            console.log("NO")
            return;
        }
    }
 
    console.log("YES")
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
