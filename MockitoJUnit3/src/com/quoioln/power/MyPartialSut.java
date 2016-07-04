package com.quoioln.power;

/**
 * @author vpquoi
 *
 */
public class MyPartialSut {
	public boolean myMethod() {
		MyCollaborator collaborator = createCollaborator();
		// some behaviour worth testing here which uses collaborator
		return true;
	}
	// method extracted to facilitate testing
	MyCollaborator createCollaborator() {
		return new MyCollaborator();
	}
}
