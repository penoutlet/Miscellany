# List comprehension
newList = [1,3,2,4]
newList = [2 * item for item in newList if item > 2]
print(newList)

#Dictionary iteration
goals = {"Software Engineer": 1, "Girlfriend": 2, "Silicon valley": 3}
for goal in goals:
    print("Goal", goal, " - Priority", goals[goal])

#tuple unpacking using .items()
for key, value in goals.items():
    print(key, '->', value)

print("Dict .keys() method")
for val in goals.keys():
    print(val)

# Using 'in'
print("Is girlfriend in the keys?","Girlfriend" in goals.keys())


# Modify / operate on the items in a dict
for k,v in goals.items():
    goals[k] = 1 # modifies the value stored at each key

# Delete from a dictionary
items = {'switch': 250, 'ps4': 250, 'laptop': 600}
for item in list(items.keys()):
    if item=="ps4":
        del items[item]
print(items)

# Swapping key and value
new_Dict = {}

for k,v in items.items():
    new_Dict[v] = k
print(new_Dict)

