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
    const S = data[0];
 
    let charsMap = new Map([]);
    let result = {
        'char': '',
        'occurrence': 0,
    }
    
    for (let i= 0; i < S.length ;i++) {
        const char = S[i];
        const occurrence = charsMap.get(char);
        let newOccurrence = 1;
        if (occurrence) {
            newOccurrence = occurrence+1;
        }
 
        charsMap.set(char, newOccurrence);
        if (newOccurrence > result.occurrence
        || (newOccurrence == result.occurrence && char < result.char)) {
            result.occurrence = newOccurrence;
            result.char = char;
        }
    }
 
    console.log(`${result.char} ${result.occurrence}`)
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
