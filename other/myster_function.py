def mystery_function(xs);
	k = {}
	for x in xs:
		if k.get(x):
			k[x] += 1
		else:
			k[x] = 1
	return k