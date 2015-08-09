package nezandfish.dnd.charactersheet;

import java.io.File;
import java.io.IOException;

public class FileManager {
	
	//save desktop and root folder paths as strings
	private static final String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop";
	private static final String ROOT_FOLDER_PATH = DESKTOP_PATH + "/Character Sheet";
	private static final String CHARACTERS_FOLDER_PATH = ROOT_FOLDER_PATH + "/Characters";
	
	static File desktop = new File(DESKTOP_PATH);
	static File rootFolder = new File(ROOT_FOLDER_PATH);
	static File charactersFolder = new File(CHARACTERS_FOLDER_PATH);
	
	public static void startUp(){
		//check if the 'Character Sheet' folder exists on the desktop
		if(!rootFolder.exists()){
			initialFileSetup();
		}
	}
	
	//create initial files and folders/directories
	static void initialFileSetup(){
		//File.mkdir() creates a directory/folder
		rootFolder.mkdir();
		charactersFolder.mkdir();
	}
}