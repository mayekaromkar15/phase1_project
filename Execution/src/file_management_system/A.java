
		
		List<String> lisString=new ArrayList<>(Arrays.asList("hey","hii","hello","java","jee","vinay","pavan","jme"));
		
		
		
		
		
		List<String> results=lisString.stream().sorted(Collections.reverseOrder()).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("results "+results);
		
		results=lisString.stream().filter(s->s.length()>3 && s.length()<5).sorted(Collections.reverseOrder()).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("results "+results);
	}