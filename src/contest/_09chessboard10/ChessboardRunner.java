package contest._09chessboard10;

import resources.robot.NGCRobot;

/**
 * Worlds:
 * 	1. chessboard1x10.kwld
 *  2. chessboard3x3.kwld
 *  3. chessboard5x3.kwld
 *  4. chessboard7x7.kwld
 *  5. chessboard8x8.kwld
 * */
public class ChessboardRunner {

	public static void main(String[] args) {
		new Chessboard(1, 1, NGCRobot.East, NGCRobot.infinity, "chessboard5x3.kwld");
	}

}
