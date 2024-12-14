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
    const N = parseInt(data[0]);
    const S = data[1];
    const alphabet = 'abcdefghijklmnopqrstuvwxyz';
 
    let result = '';
    let maxIndex = 0;
 
    for (let i = alphabet.length - 1; i >= 0; i--) {
        const char = alphabet[i];
        let index = S.indexOf(char, maxIndex);
 
        while (index !== -1) {
            result += char;
            maxIndex = index + 1;
            index = S.indexOf(char, maxIndex);
            break; 
        }
    }
 
    console.log(result);
}
 
function main(input) {
    const data = input.trim().split("\n");
    solve(data);
}
