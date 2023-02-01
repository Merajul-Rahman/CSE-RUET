package com.example.cseruet;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class routine extends AppCompatActivity {
private Toolbar toolbar;
private Button one,two,three,four,five,six,seven,eight;
TextView as,bs,cs;
Button a,b,c,d,e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);
        toolbar=(androidx.appcompat.widget.Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.rutinetest);
                as=findViewById(R.id.text);
                bs=findViewById(R.id.text2);
                cs=findViewById(R.id.text3);
                a=findViewById(R.id.a);
                b=findViewById(R.id.b);
                c=findViewById(R.id.c);
                d=findViewById(R.id.d);
                e=findViewById(R.id.e);
                as.setText(R.string.a1aday);
                bs.setText(R.string.b1aday);
                cs.setText(R.string.c1aday);
                a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a1aday);
                        bs.setText(R.string.b1aday);
                        cs.setText(R.string.c1aday);
                    }
                });
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a1bday);
                        bs.setText(R.string.b1bday);
                        cs.setText(R.string.c1bday);
                    }
                });
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a1cday);
                        bs.setText(R.string.b1cday);
                        cs.setText(R.string.c1cday);
                    }
                });
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a1dday);
                        bs.setText(R.string.b1dday);
                        cs.setText(R.string.c1dday);
                    }
                });
                e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a1eday);
                        bs.setText(R.string.b1eday);
                        cs.setText(R.string.c1eday);
                    }
                });

            }
        });
       two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.rutinetest);
                as=findViewById(R.id.text);
                bs=findViewById(R.id.text2);
                cs=findViewById(R.id.text3);
                a=findViewById(R.id.a);
                b=findViewById(R.id.b);
                c=findViewById(R.id.c);
                d=findViewById(R.id.d);
                e=findViewById(R.id.e);
                as.setText(R.string.not);
                bs.setText(R.string.not);
                cs.setText(R.string.not);
                a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.not);
                        bs.setText(R.string.not);
                        cs.setText(R.string.not);
                    }
                });
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.not);
                        bs.setText(R.string.not);
                        cs.setText(R.string.not);
                    }
                });
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.not);
                        bs.setText(R.string.not);
                        cs.setText(R.string.not);
                    }
                });
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.not);
                        bs.setText(R.string.not);
                        cs.setText(R.string.not);
                    }
                });
                e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.not);
                        bs.setText(R.string.not);
                        cs.setText(R.string.not);
                    }
                });
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.rutinetest);
                as=findViewById(R.id.text);
                bs=findViewById(R.id.text2);
                cs=findViewById(R.id.text3);
                a=findViewById(R.id.a);
                b=findViewById(R.id.b);
                c=findViewById(R.id.c);
                d=findViewById(R.id.d);
                e=findViewById(R.id.e);
                as.setText(R.string.a2aday);
                bs.setText(R.string.b2aday);
                cs.setText(R.string.c2aday);
                a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a2aday);
                        bs.setText(R.string.b2aday);
                        cs.setText(R.string.c2aday);
                    }
                });
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a2bday);
                        bs.setText(R.string.b2bday);
                        cs.setText(R.string.c2bday);
                    }
                });
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a2cday);
                        bs.setText(R.string.b2cday);
                        cs.setText(R.string.c2cday);
                    }
                });
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a2dday);
                        bs.setText(R.string.b2dday);
                        cs.setText(R.string.c2dday);
                    }
                });
                e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a2eday);
                        bs.setText(R.string.b2eday);
                        cs.setText(R.string.c2eday);
                    }
                });

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.rutinetest);
                as=findViewById(R.id.text);
                bs=findViewById(R.id.text2);
                cs=findViewById(R.id.text3);
                a=findViewById(R.id.a);
                b=findViewById(R.id.b);
                c=findViewById(R.id.c);
                d=findViewById(R.id.d);
                e=findViewById(R.id.e);
                as.setText(R.string.a4aday);
                bs.setText(R.string.b4aday);
                cs.setText(R.string.c4aday);
                a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a4aday);
                        bs.setText(R.string.b4aday);
                        cs.setText(R.string.c4aday);
                    }
                });
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a4bday);
                        bs.setText(R.string.b4bday);
                        cs.setText(R.string.c4bday);
                    }
                });
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a4cday);
                        bs.setText(R.string.b4cday);
                        cs.setText(R.string.c4cday);
                    }
                });
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a4dday);
                        bs.setText(R.string.b4dday);
                        cs.setText(R.string.c4dday);
                    }
                });
                e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a4eday);
                        bs.setText(R.string.b4eday);
                        cs.setText(R.string.c4eday);
                    }
                });

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.rutinetest);
                as=findViewById(R.id.text);
                bs=findViewById(R.id.text2);
                cs=findViewById(R.id.text3);
                a=findViewById(R.id.a);
                b=findViewById(R.id.b);
                c=findViewById(R.id.c);
                d=findViewById(R.id.d);
                e=findViewById(R.id.e);
                as.setText(R.string.not);
                bs.setText(R.string.not);
                cs.setText(R.string.not);
                a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.not);
                        bs.setText(R.string.not);
                        cs.setText(R.string.not);
                    }
                });
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.not);
                        bs.setText(R.string.not);
                        cs.setText(R.string.not);
                    }
                });
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.not);
                        bs.setText(R.string.not);
                        cs.setText(R.string.not);
                    }
                });
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.not);
                        bs.setText(R.string.not);
                        cs.setText(R.string.not);
                    }
                });
                e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.not);
                        bs.setText(R.string.not);
                        cs.setText(R.string.not);
                    }
                });
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.twosec);
                as=findViewById(R.id.text);
                bs=findViewById(R.id.text2);
                a=findViewById(R.id.a);
                b=findViewById(R.id.b);
                c=findViewById(R.id.c);
                d=findViewById(R.id.d);
                e=findViewById(R.id.e);
                as.setText(R.string.a8aday);
                bs.setText(R.string.b8aday);
                a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8aday);
                        bs.setText(R.string.b8aday);
                    }
                });
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8bday);
                        bs.setText(R.string.b8bday);
                    }
                });
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8cday);
                        bs.setText(R.string.b8cday);
                    }
                });
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8dday);
                        bs.setText(R.string.b8dday);
                    }
                });
                e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8eday);
                        bs.setText(R.string.b8eday);
                    }
                });

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.twosec);
                as=findViewById(R.id.text);
                bs=findViewById(R.id.text2);
                a=findViewById(R.id.a);
                b=findViewById(R.id.b);
                c=findViewById(R.id.c);
                d=findViewById(R.id.d);
                e=findViewById(R.id.e);
                as.setText(R.string.a8aday);
                bs.setText(R.string.b8aday);
                a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8aday);
                        bs.setText(R.string.b8aday);
                    }
                });
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8bday);
                        bs.setText(R.string.b8bday);
                    }
                });
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8cday);
                        bs.setText(R.string.b8cday);
                    }
                });
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8dday);
                        bs.setText(R.string.b8dday);
                    }
                });
                e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8eday);
                        bs.setText(R.string.b8eday);
                    }
                });

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.twosec);
                as=findViewById(R.id.text);
                bs=findViewById(R.id.text2);
                a=findViewById(R.id.a);
                b=findViewById(R.id.b);
                c=findViewById(R.id.c);
                d=findViewById(R.id.d);
                e=findViewById(R.id.e);
                as.setText(R.string.a8aday);
                bs.setText(R.string.b8aday);
                a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8aday);
                        bs.setText(R.string.b8aday);
                    }
                });
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8bday);
                        bs.setText(R.string.b8bday);
                    }
                });
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8cday);
                        bs.setText(R.string.b8cday);
                    }
                });
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8dday);
                        bs.setText(R.string.b8dday);
                    }
                });
                e.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        as.setText(R.string.a8eday);
                        bs.setText(R.string.b8eday);
                    }
                });

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.infor:
                startActivity(new Intent(this, info.class));
                return true;
            case R.id.about:
                startActivity(new Intent(this, about.class));
                return true;
            case R.id.settings:
                startActivity(new Intent(this, settings.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
