package com.example.group_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

import com.example.group_project.databinding.ActivityMainBinding;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.math.BigDecimal;


public class MainActivity extends AppCompatActivity
{

    ActivityMainBinding mActivityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mActivityMainBinding.getRoot());

        String eToTheXPoWer = "e<sup>x</sup>";
        String xToThe2Power = "x<sup>2</sup>";
        String xToTheYPower = "x<sup>y</sup>";
        if (mActivityMainBinding.btnEToTheXPower != null || mActivityMainBinding.btnXToThe2Power != null || mActivityMainBinding.btnXToTheYPower != null){
            mActivityMainBinding.btnEToTheXPower.setText(Html.fromHtml(eToTheXPoWer, 1));
            mActivityMainBinding.btnXToThe2Power.setText(Html.fromHtml(xToThe2Power, 1));
            mActivityMainBinding.btnXToTheYPower.setText(Html.fromHtml(xToTheYPower, 1));
        }

        initialize_button_number();
        initialize_basic_button_onclick();
        initialize_special_button_onclick();
        initialize_advanced_button_onclick();

    }

    private void initialize_advanced_button_onclick() {
        if (mActivityMainBinding.btnSqrt != null){
            mActivityMainBinding.btnSqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String expression = mActivityMainBinding.tvExpression.getText().toString();
                    Double r = Math.sqrt(Double.parseDouble(expression));
                    mActivityMainBinding.tvResult.setText(String.valueOf(r));
                }
            });
        }

        if (mActivityMainBinding.btnSqrt != null){
            mActivityMainBinding.btnSqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            mActivityMainBinding.btnSqrt.getText().toString() + "(" );
                }
            });
        }
        if (mActivityMainBinding.btnSin != null){
            mActivityMainBinding.btnSin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            mActivityMainBinding.btnSin.getText().toString() + "(" );
                }
            });
        }
        if (mActivityMainBinding.btnCos != null){
            mActivityMainBinding.btnCos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            mActivityMainBinding.btnCos.getText().toString() + "(" );
                }
            });
        }
        if (mActivityMainBinding.btnTan != null){
            mActivityMainBinding.btnTan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            mActivityMainBinding.btnTan.getText().toString() + "(" );
                }
            });
        }
        if (mActivityMainBinding.btnLn != null){
            mActivityMainBinding.btnLn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            mActivityMainBinding.btnLn.getText().toString() + "(" );
                }
            });
        }
        if (mActivityMainBinding.btnLog != null){
            mActivityMainBinding.btnLog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            mActivityMainBinding.btnLog.getText().toString() + "(" );
                }
            });
        }
        if (mActivityMainBinding.btn1DivideX != null){
            mActivityMainBinding.btn1DivideX.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mActivityMainBinding.tvExpression.getText().toString().isEmpty()){
                        mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                                "1" + mActivityMainBinding.btnDivide.getText().toString());
                    } else {
                        mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                                "x1" + mActivityMainBinding.btnDivide.getText().toString());
                    }
                }
            });
        }
        if (mActivityMainBinding.btnEToTheXPower != null){
            mActivityMainBinding.btnEToTheXPower.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            "e^(");
                }
            });
        }
        if (mActivityMainBinding.btnXToThe2Power != null){
            mActivityMainBinding.btnXToThe2Power.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            "^(2)");
                }
            });
        }
        if (mActivityMainBinding.btnXToTheYPower != null){
            mActivityMainBinding.btnXToTheYPower.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            "^(");
                }
            });
        }
        if (mActivityMainBinding.btnAbsoluteX != null){
            mActivityMainBinding.btnAbsoluteX.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            "abs(");
                }
            });
        }
        if (mActivityMainBinding.btnPi != null){
            mActivityMainBinding.btnPi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            mActivityMainBinding.btnPi.getText().toString());
                }
            });
        }
        if (mActivityMainBinding.btnE != null){
            mActivityMainBinding.btnE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                            mActivityMainBinding.btnE.getText().toString());
                }
            });
        }
    }

    private void initialize_special_button_onclick() {
        mActivityMainBinding.btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText("");
                mActivityMainBinding.tvResult.setText("");
            }
        });
        mActivityMainBinding.deleteOneChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = mActivityMainBinding.tvExpression.getText().toString();
                if (expression.length() > 0) {
                    expression = expression.substring(0, expression.length() - 1);
                    mActivityMainBinding.tvExpression.setText(expression);
                }
            }
        });


        mActivityMainBinding.btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String expression = mActivityMainBinding.tvExpression.getText().toString();
                    // Thay thế các ký tự để phù hợp với cú pháp toán học
                    String replace_str = expression
                            .replace("x", "*")
                            .replace("÷", "/")
                            .replace("\u221A", "sqrt")
                            .replace("Ln", "log")
                            .replace("Log", "log10")
                            .replace("e^(", "exp(");

                    // Sử dụng ExpressionBuilder từ exp4j
                    Expression e = new ExpressionBuilder(replace_str).build();
                    // Đánh giá biểu thức
                    double result = e.evaluate();
                    // Hiển thị kết quả
                    mActivityMainBinding.tvResult.setText(String.valueOf(result));
                } catch (Exception e) {
                    // Trường hợp có lỗi xảy ra, ví dụ biểu thức không hợp lệ
                    mActivityMainBinding.tvResult.setText("Error");
                    e.printStackTrace();
                }
            }
        });

    }

    private void initialize_basic_button_onclick() {

        mActivityMainBinding.btnBracketOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                        mActivityMainBinding.btnBracketOpen.getText().toString());
            }
        });
        mActivityMainBinding.btnBracketClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                        mActivityMainBinding.btnBracketClose.getText().toString());
            }
        });
        mActivityMainBinding.btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                        mActivityMainBinding.btnDivide.getText().toString());
            }
        });
        mActivityMainBinding.btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                        "x");
            }
        });
        mActivityMainBinding.btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                        "-");
            }
        });
        mActivityMainBinding.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                        mActivityMainBinding.btnPlus.getText().toString());
            }
        });
    }

    private void initialize_button_number() {
        mActivityMainBinding.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString()
                        + mActivityMainBinding.btn0.getText().toString());
            }
        });
        mActivityMainBinding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString()
                        + mActivityMainBinding.btn1.getText().toString());
            }
        });
        mActivityMainBinding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString()
                        + mActivityMainBinding.btn2.getText().toString());
            }
        });
        mActivityMainBinding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString()
                        + mActivityMainBinding.btn3.getText().toString());
            }
        });
        mActivityMainBinding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString()
                        + mActivityMainBinding.btn4.getText().toString());
            }
        });
        mActivityMainBinding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString()
                        + mActivityMainBinding.btn5.getText().toString());
            }
        });
        mActivityMainBinding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString()
                        + mActivityMainBinding.btn6.getText().toString());
            }
        });
        mActivityMainBinding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                        mActivityMainBinding.btn7.getText().toString());
            }
        });
        mActivityMainBinding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                        mActivityMainBinding.btn8.getText().toString());
            }
        });
        mActivityMainBinding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                        mActivityMainBinding.btn9.getText().toString());
            }
        });
        mActivityMainBinding.btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText(mActivityMainBinding.tvExpression.getText().toString() +
                        mActivityMainBinding.btnDot.getText().toString());
            }
        });

        mActivityMainBinding.btnOpposite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivityMainBinding.tvExpression.setText("(-"
                        + mActivityMainBinding.tvExpression.getText());
            }
        });
    }


}