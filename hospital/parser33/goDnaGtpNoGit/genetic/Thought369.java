package genetic;
import java.util.ArrayList;
class Thought369 extends Thought{
private static ArrayList<Thought369> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 235.25601555794125;
private double fd1 = 965.3452632195992;
private Thought fo0 = null;
private Thought fo1 = null;
Thought369 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought369 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought369 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought369 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought369 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought369 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought369 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought369 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought369 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought369 instance = new Thought369 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought369 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought369 instance = new Thought369 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought369 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought369 instance = new Thought369 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought369 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought369 instance = new Thought369 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought369 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought369 instance = new Thought369 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought369 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought369 instance = new Thought369 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought369 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought369 instance = new Thought369 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought369 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought369 instance = new Thought369 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 831.4153229951861;
    fb1 = fb0 && fb1;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb1, fb0);
}
    double ld2 = 690.6474151687921;
    fb1 = !lb1;
    Output.points[4][7] += ld0;
    ld2 = fd0 - fd1;
    ld0 = ld2 + fd0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    double ld2 = 406.12071739059587;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought305.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld2;
    ab4 = fd0 > fd1;
    Output.points[4][8] += ld2;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    lb1 = fd1 < ld2;
    double ld5 = 281.7575734784092;
    double ld6 = 2.0437360365154458;
    lb4 = !ab1;
    double ld7 = 977.3321395125344;
    ld5 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
        fb1 = ad1 < ad2;
        } else if (fb0) {
        Thought lo0 = Thought246.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
        Thought lo1 = Thought90.getInstance();
if(fo0 != null){
          fo0.m1(fb1, fb0, fb1, fb0);
}
        ad1 = ad2 - ad3;
        Output.points[5][0] += ad4;
        double ld2 = 19.385521545876625;
        fb1 = fb0 || fb1;
        boolean lb3 = false;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, lb3, fb0, fb1, lb3);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        double ld0 = 406.548536313436;
        double ld1 = 94.06688353892923;
        double ld2 = 474.2151531212334;
        ad2 = ad3 + ad4;
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, ab1);
}
        ab2 = ab3 && ab4;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        ld0 = ld1 + ld2;
        fb1 = ad1 < ad2;
        lb3 = ab1 || ab2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        for(int i1=0; i1<10; i1++){
            boolean lb4 = false;
            double ld5 = 19.58970793512274;
            Thought lo6 = Thought13.getInstance(fo0, fo1, fo0, fo1, ld5, ld0, ld1, ld2);
            double ld7 = 267.9135755480229;
            double ld8 = 850.4806534484244;
            ld1 = ld2 - ad1;
            boolean lb9 = false;
if(fo0 != null){
              ad2 = fo0.m3();
}
            Output.points[5][1] -= ad3;
            Output.points[5][2] += ad4;
            double ld10 = 390.0953602512001;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    Output.points[5][3] += fd1;
    fb0 = fd0 > fd1;
    Output.points[5][4] += fd0;
    Thought lo0 = Thought273.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fd1 *= -1;
    fb0 = !fb1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    double ld2 = 602.3381463178509;
    boolean lb3 = true;
    lb1 = fd0 < fd1;
    boolean lb4 = true;
    Output.points[5][5] += ld2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao4.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    boolean lb0 = false;
    fb0 = ad4 > fd0;
    fb1 = lb0 || fb0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
        ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    lb0 = !lb1;
    ad1 = ad2 - ad3;
    fb0 = fb1 && lb0;
    ad4 = fd0 + fd1;
    Output.points[5][6] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    fd1 = ad1 - ad2;
    lb1 = ad3 < ad4;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought257.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    boolean lb1 = true;
    lb1 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3);
}
    ab4 = fd0 > fd1;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    double ld3 = 669.6274804376443;
    ab4 = fd0 < fd1;
    ld3 = fd0 - fd1;
    boolean lb4 = false;
    ld3 = fd0 + fd1;
        ab4 = fb0 || fb1;
    ld3 *= -1;
    Thought lo5 = Thought211.getInstance(fd0, fd1, ld3, fd0);
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld3, fd0, fd1);
}
    Thought lo6 = Thought132.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(lb2, lb4, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0, lb1, lb2, lb4, ab1);
}
    ab2 = fd1 > ld3;
    fd0 = fd1 - ld3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = ab1 || ab2;
    ab3 = fd0 > fd1;
        ab4 = fb0 && fb1;
    double ld1 = 673.7018008472361;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
    ld1 = ad1 + ad2;
    ab4 = ad3 > ad4;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought33.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought112.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1);
    boolean lb4 = true;
    ab4 = fb0 || fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][7] -= fd0;
    Output.points[5][8] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought156.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    Output.points[6][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 591.1469466312886;
    double ld1 = 759.8043554200036;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    double ld2 = 128.73350847047226;
    boolean lb3 = true;
    Thought lo4 = Thought210.getInstance();
    boolean lb5 = false;
    double ld6 = 467.93868944632453;
    Thought lo7 = Thought66.getInstance(lb5, ab1, ab2, ab3);
    Output.points[6][1] += ld1;
    ld2 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb8 = false;
        ab3 = ld6 < fd0;
        ab4 = fb0 && fb1;
        lb8 = fd1 > ld0;
        boolean lb9 = true;
        ld1 *= -1;
        ld2 *= -1;
        boolean lb10 = true;
}
Thought.STACK_COUNTER++;
return lb5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought123.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought65.getInstance();
    ad4 *= -1;
    boolean lb2 = true;
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    boolean lb3 = true;
    fd0 *= -1;
    Thought lo4 = Thought32.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
    fb0 = fb1 && lb2;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = fd1 < ad1;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 && ab4;
    boolean lb2 = true;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    if (ab4) {
        Thought lo3 = Thought205.getInstance(fd1, ad1, ad2, ad3);
        Thought lo4 = Thought305.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
        boolean lb5 = true;
        Output.points[6][2] += ad2;
        ad3 = ad4 + fd0;
        Thought lo6 = Thought255.getInstance();
        ab4 = fd1 < ad1;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought189.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    Output.points[6][3] += fd0;
    lb0 = fd1 > fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
    double ld2 = 3.5665576790959808;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought38.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fd0 < fd1;
        fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[6][4] += fd0;
    fb0 = fd1 > ad1;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);
}
    Thought lo3 = Thought328.getInstance(fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb1);
    lb2 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb2);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return lb4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    Output.points[6][5] += fd1;
    ab3 = ab4 || fb0;
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    boolean lb1 = false;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 666.1165647054529;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought368.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    ad1 = ad2 + ad3;
    ab2 = ab3 && ab4;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ad1);
}
    boolean lb2 = false;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fo0 = fo1.m4();
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    double ld1 = 731.0052137509477;
    boolean lb2 = false;
    ld1 *= -1;
    Thought lo3 = Thought383.getInstance(fd0, fd1, ld1, fd0);
    lb0 = lb2 && fb0;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    Output.points[6][6] += ld1;
    fb1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(lb0, lb2, lb4, fb0);
}
    fb1 = ld1 < fd0;
    fd1 = ld1 + fd0;
    Output.points[6][7] += fd1;
    Output.points[6][8] += ld1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb0, lb2, lb4, fb0);
}
if(fo0 != null){
      fo0.m2(fd1, ld1, fd0, fd1, fb1, lb0, lb2, lb4);
}

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    double ld0 = 611.2462436248665;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought279.getInstance(ld0, fd0, fd1, ld0);
    Output.points[7][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought35.getInstance(ab1, ab2, ab3, ab4);
    ld0 *= -1;
    fd0 *= -1;
    Thought lo3 = Thought381.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld4 = 72.45785555829148;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld0);
}
    ld4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = true;
    Output.points[7][1] -= ld0;
    boolean lb6 = false;
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld0, lb5, lb6, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ld4 *= -1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    fb1 = fb0 && fb1;
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[7][2] += ad2;
    fb0 = ad3 > ad4;
    fd0 *= -1;
    fd1 *= -1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought154.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    ad4 = fd0 - fd1;
    fb0 = !fb1;
        boolean lb2 = true;
    boolean lb3 = true;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, lb2, lb3, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3, fb1, lb0, lb2, lb3);
}
    ab1 = ab2 || ab3;
    ab4 = ad4 > fd0;
    fb0 = fd1 < ad1;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    double ld1 = 611.3613600721;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[7][3] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, fb0);
}
    double ld2 = 944.4791711758681;
    boolean lb3 = false;
    ld1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
}
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld2, fd0, fd1, ld1);
}

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    fd1 *= -1;
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb1 = fd1 > ad1;
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 275.08266932597724;
        ld0 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld0 = fd0 - fd1;
    fb0 = ld0 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - ld0;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, ld0, fd0);
}
    Output.points[7][4] += fd1;
    ab3 = ab4 && fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = lb1 && ab1;
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
        fd0 = fd1 - ld0;
        ab3 = ab4 && fb0;
if(ao1 != null){
          ao1.m2();
}
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    double ld0 = 292.8125278271531;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    double ld1 = 834.917256656302;
        ab3 = ld1 < ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ld0;
    Output.points[7][5] += ld1;
    if (ab3) {
        ab4 = !fb0;
        ad1 = ad2 + ad3;
        double ld2 = 874.4256706771794;
        Thought lo3 = Thought340.getInstance(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
        ab4 = fb0 && fb1;
if(ao3 != null){
          ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m3(ad4, fd0, fd1, ld2);
}
        ab1 = ld0 < ld1;
        ab2 = ab3 && ab4;
        fb0 = ad1 < ad2;
        } else {
        fb1 = !ab1;
        Thought lo4 = Thought139.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    double ld0 = 919.4776688091168;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    fb0 = !fb1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    Output.points[7][6] += fd0;
    if (fb1) {
        boolean lb1 = true;
        boolean lb2 = false;
        lb1 = fd1 < ld0;
        lb2 = !fb0;
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo3 = Thought117.getInstance(ld0, fd0, fd1, ld0);
        } else {
        double ld4 = 230.51170679492887;
        Thought lo5 = Thought141.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld4);
        ld0 *= -1;
        Thought lo6 = Thought317.getInstance();
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    ab1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        fd0 = fd1 - fd0;
        if (ab3) {
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought145.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    lb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    fb0 = !fb1;
    double ld2 = 290.2128469571185;
    lb1 = fb0 && fb1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo1.m1(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + ld2;
    Thought lo3 = Thought42.getInstance(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
    fb0 = fb1 || lb1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    Output.points[7][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Output.points[7][8] += ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb2, ab1);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m2();
}
    lb1 = ad4 > fd0;
if(fo0 != null){
      fo0.m2(lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, lb2, ab1, ab2);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao2 != null){
      lb1 = ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
if(ao3 != null){
      ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(lb2, fb0, fb1, lb0);
}
    double ld3 = 163.3910305087346;
    lb1 = !lb2;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought334.getInstance(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld3, lb1, lb2, fb0, fb1);
        lb0 = lb1 || lb2;
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought309.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[8][0] += ad2;
    fb0 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    Output.points[8][1] += ad3;
    fb1 = !fb0;
    boolean lb1 = false;
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
if(ao3 != null){
      lb1 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fd0 = fd1 - ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought334.getInstance(fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
    lb1 = lb2 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad4 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb1, lb2, fb0);
}
        fb1 = lb1 && lb2;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    Thought lo0 = Thought114.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[8][2] -= fd0;
    fd1 *= -1;
    double ld1 = 981.9294459707149;
    fb1 = ld1 > fd0;
    ab1 = !ab2;
    boolean lb2 = false;
if(fo1 != null){
      ab2 = fo1.m2();
}
    boolean lb3 = false;
    double ld4 = 468.95018459637396;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld4, lb2, lb3, ab1, ab2);
}
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, ld4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld1;
    fb1 = ld4 < fd0;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
        fd1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    Output.points[8][3] += ad2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad3 *= -1;
        Output.points[8][4] += ad4;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ad1;
    Thought lo2 = Thought19.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
    double ld3 = 754.9768940456837;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    double ld0 = 892.7048406981229;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo1 = Thought26.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Thought lo0 = Thought344.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fb1 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
        boolean lb2 = true;
    fb0 = fd1 > fd0;
    fb1 = lb1 || lb2;
    fd1 = fd0 - fd1;
    fb0 = !fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    Output.points[8][5] -= fd0;
    Thought lo1 = Thought396.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = false;
    Thought lo3 = Thought111.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    lb2 = fb0 && fb1;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      lb2 = fo0.m2(fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    fb0 = !fb1;
        Output.points[8][6] += fd1;
    boolean lb4 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0, lb2, lb4, fb0, fb1);
}
    lb0 = !lb2;
    Thought lo5 = Thought330.getInstance(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
