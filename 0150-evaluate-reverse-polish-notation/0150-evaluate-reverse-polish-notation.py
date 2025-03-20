class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        operations = {
            '+': lambda x, y: x + y,
            '-': lambda x, y: x - y,
            '*': lambda x, y: x * y,
            '/': lambda x, y: int(x / y)
        }
        
        for t in tokens:
            if t.lstrip('-').isdigit():
                stack.append(int(t))
            else:
                b = stack.pop()
                a = stack.pop()
                stack.append(operations[t](a, b))
        
        return stack.pop()
                

