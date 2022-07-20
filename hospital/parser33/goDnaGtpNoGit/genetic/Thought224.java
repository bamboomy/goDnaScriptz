package genetic;
import java.util.ArrayList;
class Thought224 extends Thought{
private static ArrayList<Thought224> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 227.42126937808402;
private double fd1 = 2.3917632135797677;
private Thought fo0 = null;
private Thought fo1 = null;
Thought224 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought224 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought224 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought224 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought224 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought224 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought224 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought224 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought224 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought224 instance = new Thought224 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought224 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought224 instance = new Thought224 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought224 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought224 instance = new Thought224 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought224 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought224 instance = new Thought224 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought224 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought224 instance = new Thought224 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought224 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought224 instance = new Thought224 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought224 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought224 instance = new Thought224 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought224 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought224 instance = new Thought224 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[4][6] += fd0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    double ld0 = 966.7651519886687;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m1();
}
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
    Thought lo3 = Thought343.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
    lb2 = fb0 && fb1;
    lb1 = lb2 || fb0;
    fb1 = fd0 < fd1;

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
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    Output.points[4][7] += fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    fd0 *= -1;
    double ld1 = 571.2767863899959;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = true;
    fd0 = fd1 - ld1;
    Thought lo5 = Thought176.getInstance();
    boolean lb6 = true;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(lb4, lb6, ab1, ab2);
}
    Output.points[4][8] -= fd1;

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
    ad1 = ad2 + ad3;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = !fb1;
    ad2 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, lb0, lb1, lb2, fb0);
}
    fb1 = ad1 > ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
}
    boolean lb3 = true;

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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    boolean lb0 = true;
if(fo1 != null){
          fd1 = fo1.m3();
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    fb1 = !lb0;
    boolean lb1 = true;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
    Thought lo3 = Thought130.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    Output.points[5][0] += ad3;
    Output.points[5][1] += ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ab4 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb2, lb4, ab1, ab2);
}
    double ld5 = 403.2401026349955;
if(fo1 != null){
      ab3 = fo1.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought81.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    double ld1 = 984.6192366025056;
        boolean lb2 = true;
    lb2 = fb0 || fb1;
    lb2 = fd0 < fd1;
    ld1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Output.points[5][2] -= ad3;
    ad4 *= -1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought61.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = ad3 > ad4;
    Output.points[5][3] += fd0;
    fd1 = ad1 - ad2;
    boolean lb2 = true;
    fb0 = fb1 && lb1;
    lb2 = ad3 < ad4;
    double ld3 = 992.7997651293551;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
        boolean lb0 = true;
    fd0 *= -1;
    Thought lo1 = Thought349.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
        boolean lb2 = true;
    Output.points[5][4] -= fd0;
    double ld3 = 246.92814010017145;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld3, fd0);
}
if(ao1 != null){
      ao1.m2();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought34.getInstance(lb1, ab1, ab2, ab3);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
        lb1 = ab1 && ab2;
        if (ab3) {
            boolean lb3 = false;
            fd0 *= -1;
if(ao2 != null){
              fd1 = ao2.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
            lb3 = lb0 || lb1;
if(ao3 != null){
              ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fb1 = !lb0;
            fd1 *= -1;
            boolean lb1 = true;
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo1 != null){
              fo0 = fo1.m4(lb0, fb0, fb1, lb1);
}
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb1);
}
if(fo1 != null){
              fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb1);
}
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb1);
}
            double ld2 = 584.3081587444075;
            lb0 = ld2 > fd0;
            fd1 = ld2 - fd0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            Thought lo3 = Thought183.getInstance(fd1, ld2, fd0, fd1);
            fb0 = !fb1;
            Thought lo4 = Thought253.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}}
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    Output.points[5][5] += fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2();
}
    Thought lo3 = Thought158.getInstance(ab2, ab3, ab4, fb0);
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + fd0;
    Output.points[5][6] -= fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought331.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    lb0 = fb0 && fb1;
    ad3 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      lb0 = fo1.m2();
}
    Output.points[5][7] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought129.getInstance(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
    boolean lb3 = true;

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
    ad2 = ad3 - ad4;
    Thought lo0 = Thought57.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
        ab1 = !ab2;
    if (ab3) {
        ab4 = fb0 && fb1;
        fd0 = fd1 + ad1;
        ab1 = ab2 || ab3;
        double ld1 = 99.52358395742961;
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad4 *= -1;
        ab4 = fd0 > fd1;
        ld1 *= -1;
        Output.points[5][8] += ad1;
if(fo0 != null){
          fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
        ad2 = ad3 - ad4;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 481.897780107774;
    fb1 = ld0 < fd0;
    fb0 = fd1 < ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
    double ld2 = 911.6406282836274;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - ld0;
    double ld3 = 855.0594189712549;
    double ld4 = 446.1185281266723;
    boolean lb5 = true;

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
    fb1 = fb0 && fb1;
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
    fb0 = ad3 < ad4;
    boolean lb0 = false;
    Output.points[6][0] -= fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    Output.points[6][1] -= fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought217.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    Output.points[6][2] += fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    lb1 = ab1 && ab2;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb1;
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
    ad2 = ad3 - ad4;
    ab2 = ab3 && ab4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld0 = 462.90084802012393;
    fd0 *= -1;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 = ld0 + ad1;
    ab4 = !fb0;
    fb1 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
    boolean lb1 = true;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought100.getInstance(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);

Thought.STACK_COUNTER++;
return lb1;
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
      fd0 = fo1.m3();
}
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    double ld0 = 41.56315318024262;
    Thought lo1 = Thought47.getInstance(fb1, fb0, fb1, fb0);
    Output.points[6][3] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fd0 = fo0.m3();
}
        ab4 = fb0 || fb1;
if(fo1 != null){
          ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        Output.points[6][4] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        Output.points[6][5] -= fd0;
        Output.points[6][6] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = !ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        double ld0 = 978.1828242660313;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
        double ld1 = 175.11987891911357;
        Output.points[6][7] += ld1;
        boolean lb2 = false;
        ab1 = ab2 && ab3;
        if (ab4) {
}}
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
    Thought lo0 = Thought129.getInstance();
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought380.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > ad1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
        boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return ad4;
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
if(fo0 != null){
          ab1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    Thought lo1 = Thought180.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3();
}
    Thought lo2 = Thought64.getInstance(lb0, ab1, ab2, ab3);

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    boolean lb0 = true;
    fd0 *= -1;
    Thought lo1 = Thought150.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
    boolean lb2 = false;
    fb0 = fb1 || lb0;
    boolean lb3 = false;
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
    boolean lb4 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[6][8] += ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    double ld1 = 546.0911782421591;
    if (lb0) {
        fb0 = fb1 && lb0;
if(ao3 != null){
          ad2 = ao3.m3();
}
if(ao4 != null){
          ad3 = ao4.m3(fb0, fb1, lb0, fb0);
}
        boolean lb2 = true;
        Thought lo3 = Thought304.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, fb0, fb1, lb2, lb0);
if(ao3 != null){
          ao3.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb2, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb0);
}
        fb0 = fd0 > fd1;
        if (fb1) {
if(ao4 != null){
              lb2 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
              ld1 = ao3.m3(ad1, ad2, ad3, ad4);
}
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = fd1 < fd0;
        fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    ab2 = ab3 || ab4;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    lb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        lb0 = lb1 && ab1;
        double ld3 = 152.07155955017197;
        ab2 = ld3 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
          lb2 = ao1.m2(ao2, ao3, ao4, fo0);
}
        lb0 = fd1 > ld3;
        lb1 = !ab1;
}
Thought.STACK_COUNTER++;
return fd1;
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
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 > fd1;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    fd0 *= -1;
    double ld2 = 568.6386292824591;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
    Output.points[7][0] -= fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo0 != null){
      fo0.m2(lb1, ab1, ab2, ab3);
}
    double ld3 = 961.0208182126445;
        ld2 = ld3 - ad1;
    ab4 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb0, lb1, ab1);
}
    Thought lo4 = Thought68.getInstance(fd1, ld2, ld3, ad1, ab2, ab3, ab4, fb0);
    for(int i0=0; i0<10; i0++){
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought61.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought19.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought239.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        fd0 = fd1 - fd0;
        fb1 = !fb0;
        }
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2();
}
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb3, fb0);
}
    fb1 = fd0 < fd1;
    lb3 = fb0 && fb1;
    double ld4 = 75.91613212930845;
    Output.points[7][1] += ld4;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld4, fd0, lb3, fb0, fb1, lb3);
}
    fb0 = fb1 || lb3;
    double ld5 = 560.9978371913131;

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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
        ab4 = fb0 && fb1;
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab4 = fb0 || fb1;
        ab1 = ab2 || ab3;
        ab4 = fd1 > fd0;
        Thought lo0 = Thought226.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo0.m2();
}
if(fo1 != null){
          fo1.m1(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        fd0 = fd1 - fd0;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab2 = fd1 < fd0;
        double ld2 = 434.2847328948403;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought149.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
    if (lb0) {
        fb0 = !fb1;
        Thought lo2 = Thought125.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
        lb0 = !fb0;
        fb1 = ad2 > ad3;
if(fo0 != null){
          lb0 = fo0.m2();
}
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
        Output.points[7][2] -= ad4;
        lb0 = fd0 < fd1;
        fb0 = ad1 > ad2;
        ad3 = ad4 + fd0;
        boolean lb3 = false;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb3, lb0);
}
        fb0 = !fb1;
        fd0 = fd1 + ad1;
        Output.points[7][3] += ad2;
        Output.points[7][4] += ad3;
        lb3 = ad4 > fd0;
        Output.points[7][5] -= fd1;
        ad1 *= -1;
        lb0 = fb0 || fb1;
        lb3 = ad2 > ad3;
        boolean lb4 = true;
        ad4 = fd0 + fd1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 780.0871787318735;
        boolean lb1 = false;
    Thought lo2 = Thought314.getInstance(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    ad4 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
    ad1 = ad2 + ad3;
    boolean lb3 = false;
    Thought lo4 = Thought237.getInstance(fo1, fo0, fo1, fo0);
    ab1 = !ab2;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ab3 = ld0 > ad1;
    ad2 = ad3 + ad4;
    ab4 = fb0 && fb1;
    boolean lb5 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb3, lb5, ab1);
}
    Output.points[7][6] -= ad4;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, lb1, lb3, lb5);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    boolean lb6 = true;
    boolean lb7 = true;
    boolean lb8 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    Output.points[7][7] += fd0;
    fb0 = fb1 && lb0;
    lb1 = fd1 < fd0;
    Output.points[7][8] += fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && lb0;
    lb1 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
    Thought lo0 = Thought111.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld1 = 456.21675240314363;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought164.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;

Thought.STACK_COUNTER++;
return ao3;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought61.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    lb1 = !ab1;
    ab2 = fd1 < fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    fd0 *= -1;
    lb1 = ab1 || ab2;
if(ao3 != null){
      ab3 = ao3.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb2 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    lb1 = lb2 && ab1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought83.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;

Thought.STACK_COUNTER++;
return ao2;
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
    ab2 = ab3 || ab4;
    Thought lo0 = Thought79.getInstance();
    double ld1 = 184.33413011849785;
    double ld2 = 826.8328778797754;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
        Thought lo3 = Thought298.getInstance(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
if(ao1 != null){
          ab1 = ao1.m2(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
        fb1 = ld2 > ad1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        Thought lo4 = Thought106.getInstance(ao1, ao2, ao3, ao4);
        fb0 = ad2 > ad3;
        fb1 = !ab1;
        double ld5 = 633.021557452858;
        Thought lo6 = Thought28.getInstance(ad3, ad4, fd0, fd1);
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ld5, ld1, ld2, ad1);
}
        fb0 = fb1 && ab1;
        ad2 = ad3 - ad4;
        ab2 = ab3 && ab4;
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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought250.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    fd1 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
    double ld3 = 128.60906055598994;

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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought201.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb2 = false;
        Output.points[8][0] -= fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    lb2 = fb0 || fb1;
    boolean lb3 = true;
    lb1 = lb2 || lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[8][1] -= fd0;
    fd1 = fd0 + fd1;
        fd0 *= -1;

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
    Thought lo0 = Thought212.getInstance();
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = fd0 - fd1;
    Output.points[8][2] -= fd0;
    boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
    double ld5 = 310.71821407316315;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
}
