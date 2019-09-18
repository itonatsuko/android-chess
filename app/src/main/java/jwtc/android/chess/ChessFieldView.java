package jwtc.android.chess;

import jwtc.chess.board.ChessBoard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class ChessFieldView extends View {
    private static Paint _paint = new Paint();
    public int fieldColor;
    public int fieldIndex;

    public ChessFieldView(Context context) {
        super(context);
        fieldColor = ChessBoard.BLACK;
    }

    public ChessFieldView(Context context, AttributeSet atts) {
        super(context, atts);
        fieldColor = ChessBoard.BLACK;
    }

    public void onDraw(Canvas canvas) {
        _paint.setColor(fieldColor == ChessBoard.BLACK ? 0xff000000 : 0xffffffff);
        canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), _paint);
    }
}
