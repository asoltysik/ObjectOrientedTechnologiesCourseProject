locations = ['Amerykanski', 'Azjatycki', 'Europejski']
types = ['Luxury', 'Sedan', 'Small']

for location in locations:
    for typ in types:
        clazz_str = f'package auta;\npublic class {location}{typ} extends {location} implements i{typ} {{\n    public String get{typ}Description() {{ return "{location} - {typ}"; }}\n}}'
        with open(f'{location}{typ}.java', 'w') as f:
            f.write(clazz_str)
