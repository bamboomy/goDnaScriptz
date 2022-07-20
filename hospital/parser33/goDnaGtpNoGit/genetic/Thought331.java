package genetic;
import java.util.ArrayList;
class Thought331 extends Thought{
private static ArrayList<Thought331> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 964.1347377407936;
private double fd1 = 166.30547510248695;
private Thought fo0 = null;
private Thought fo1 = null;
Thought331 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought331 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought331 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought331 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought331 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought331 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought331 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought331 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought331 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought331 instance = new Thought331 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought331 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought331 instance = new Thought331 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought331 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought331 instance = new Thought331 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought331 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought331 instance = new Thought331 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought331 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought331 instance = new Thought331 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought331 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought331 instance = new Thought331 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought331 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought331 instance = new Thought331 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought331 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought331 instance = new Thought331 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && lb0;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    Output.points[5][7] += fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb2 = !fb0;
    fb1 = lb0 && lb1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
if(fo1 != null){
      ab4 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    double ld0 = 811.4312809664983;
    if (fb0) {
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld0, ad1);
}
        Thought lo2 = Thought91.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
        double ld3 = 804.9398048292951;
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
    ab1 = ad1 < ad2;
    ab2 = ab3 || ab4;
if(fo1 != null){
      ad3 = fo1.m3();
}
if(fo0 != null){
      ad4 = fo0.m3(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ad1;
    ab3 = ab4 && fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought323.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought218.getInstance(ad4, fd0, fd1, ad1);

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
    Thought lo0 = Thought146.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
    Output.points[5][8] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb0 = !fb1;
    Output.points[6][0] += fd1;
    double ld1 = 967.3431680768266;
if(ao3 != null){
      ld1 = ao3.m3(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fd1 = ld1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Output.points[6][1] += fd1;
    fb0 = ld1 > fd0;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought347.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    double ld1 = 425.7817583588253;
    Thought lo2 = Thought167.getInstance();
    double ld3 = 145.96449330402652;
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    ad4 = fd0 + fd1;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > ld3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[6][2] -= fd0;
    if (fb1) {
if(ao1 != null){
          ao1.m2(fd1, ld1, ld3, ad1, fb0, fb1, fb0, fb1);
}
        double ld4 = 506.0931711681448;
        fb0 = fb1 || fb0;
        } else if (fb1) {
        double ld5 = 217.13757497122145;
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
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab2 = !ab3;
    ab4 = !fb0;
    Output.points[6][3] -= fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    Output.points[6][4] += fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought247.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
    Output.points[6][5] -= fd0;
    Thought lo2 = Thought292.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    double ld3 = 37.65015401557708;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        ab2 = fd0 < fd1;
        ld3 *= -1;
if(ao3 != null){
          ab3 = ao3.m2(fd0, fd1, ld3, fd0);
}
        boolean lb4 = true;
        fd1 = ld3 - fd0;
        ab3 = !ab4;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    boolean lb0 = true;
    lb0 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      fd0 = ao4.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    double ld1 = 820.6856114396362;
    boolean lb2 = true;
    boolean lb3 = false;
    lb0 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1, lb3, ab1, ab2, ab3);
}
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, lb0, lb2, lb3, lb4);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        Thought lo2 = Thought341.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][6] -= fd0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[6][7] += fd1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought122.getInstance();
    fb0 = fd1 > fd0;
    double ld1 = 832.1073631207331;
    fd0 = fd1 - ld1;
    fb1 = !ab1;
    fd0 = fd1 + ld1;
    fd0 *= -1;
    ab2 = fd1 > ld1;
    double ld2 = 796.5037874384852;
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    ld2 = fd0 + fd1;
    Thought lo3 = Thought204.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
    ld1 = ld2 - fd0;
    Output.points[6][8] += fd1;
    fb0 = ld1 < ld2;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, ld2, fb1, ab1, ab2, ab3);
}
    Thought lo4 = Thought163.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    ab1 = !ab2;

Thought.STACK_COUNTER++;
return ab3;
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
    double ld0 = 433.2212791220573;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    ld0 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought196.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
if(fo0 != null){
      ad4 = fo0.m3();
}
    Thought lo2 = Thought348.getInstance(fb1, fb0, fb1, fb0);

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][0] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Output.points[7][1] += ad4;
        ab1 = !ab2;

Thought.STACK_COUNTER++;
return ab3;
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
    Thought lo0 = Thought187.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 414.98697510834495;
    fb0 = fb1 && fb0;
    fb1 = ld1 > fd0;
    boolean lb2 = false;
    Thought lo3 = Thought352.getInstance(fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
    fb0 = !fb1;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
    Output.points[7][2] -= fd0;
    Thought lo4 = Thought263.getInstance(ao2, ao3, ao4, fo0);
    fd1 = ld1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
        Output.points[7][3] += ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad1 < ad2;
if(ao4 != null){
      ao4.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought329.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    double ld1 = 834.0318969887464;
    fb1 = !fb0;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 = ld1 - ad1;
    double ld2 = 923.101675200314;
    Thought lo3 = Thought360.getInstance(ao3, ao4, fo0, fo1);
    fb1 = fb0 && fb1;
    boolean lb4 = true;
    Thought lo5 = Thought60.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ld2);
}
    Thought lo6 = Thought243.getInstance();
if(ao1 != null){
      lb4 = ao1.m2(fb0, fb1, lb4, fb0);
}
    boolean lb7 = false;
    ad1 = ad2 + ad3;
    fb0 = fb1 && lb4;
    lb7 = ad4 > fd0;

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
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    Thought lo1 = Thought149.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
    ab2 = fd1 > fd0;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld2 = 868.2353766321382;
    double ld3 = 852.3354236500182;
    double ld4 = 37.21132518129916;
    ab4 = fb0 || fb1;
    lb0 = ld3 > ld4;
    fd0 *= -1;
    fd1 *= -1;
    ab1 = ld2 < ld3;
if(ao2 != null){
      ao1 = ao2.m4(ld4, fd0, fd1, ld2);
}
    Thought lo5 = Thought248.getInstance(ao3, ao4, fo0, fo1, ld3, ld4, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4();
}

Thought.STACK_COUNTER++;
return ab2;
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
    boolean lb0 = true;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao3.m1(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;
    fb1 = !lb0;
    fd0 = fd1 - ad1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought379.getInstance(ao3, ao4, fo0, fo1);
    double ld2 = 600.3272994385749;
    Output.points[7][4] += ad1;
    Thought lo3 = Thought220.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ld2 + ad1;
    Thought lo4 = Thought32.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fb1 = !lb0;
    fd1 = ld2 - ad1;
if(fo1 != null){
              fo0 = fo1.m4();
}
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
    ab4 = fd0 > fd1;
    boolean lb5 = false;
if(ao1 != null){
      ao1.m1(ab4, fb0, fb1, lb0);
}
    lb5 = ab1 && ab2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 752.8340858637248;
    fb1 = ld0 < fd0;
        fb0 = fb1 && fb0;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    fb1 = fd1 > ld0;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        if (fb0) {
}}
Thought.STACK_COUNTER++;
return ld0;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    Output.points[7][5] += fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb0 = fb1 || fb0;
    if (fb1) {
        ad4 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        ad3 *= -1;
        } else if (fb1) {
        Output.points[7][6] -= ad4;
        Thought lo0 = Thought380.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Output.points[7][7] += ad3;
        boolean lb1 = false;
        Thought lo2 = Thought128.getInstance(fo0, fo1, fo0, fo1);
        Thought lo3 = Thought154.getInstance(ad4, fd0, fd1, ad1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = ad4 < fd0;
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    Output.points[7][8] += ad4;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        double ld2 = 520.1431268038583;
        Thought lo3 = Thought181.getInstance(fo1, fo0, fo1, fo0);
        Thought lo4 = Thought14.getInstance(ad3, ad4, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 72.96206061346003;
if(ao1 != null){
      ao1.m3();
}
    double ld1 = 793.45494945043;
if(ao2 != null){
      ld1 = ao2.m3(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought124.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
    fd0 = fd1 + ld0;
    if (fb0) {
        ld1 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Output.points[8][0] += ad4;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab1 = fd1 < fd0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 + fd1;

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
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
          ao2.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m1(fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    ad4 *= -1;
    boolean lb2 = false;
    fd0 *= -1;
    double ld3 = 189.86025236776715;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ad1);
}
    lb0 = lb1 && lb2;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab1 = ad3 < ad4;
    boolean lb4 = true;
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought302.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2();
}
    fb0 = fb1 && lb0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        }
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    Output.points[8][1] -= fd1;
    Thought lo0 = Thought338.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
          fd1 = fo0.m3(fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    double ld2 = 545.3142173439307;
    boolean lb3 = false;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    double ld0 = 101.0574182891433;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought291.getInstance(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = true;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
    ad3 *= -1;
    boolean lb5 = false;
    lb2 = ad4 > fd0;
        boolean lb6 = false;
    if (lb3) {
        if (lb4) {
            Thought lo7 = Thought352.getInstance(fo0, fo1, fo0, fo1);
            boolean lb8 = false;
            lb4 = !lb5;
            lb6 = fd1 > ld0;
}}
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    boolean lb0 = false;
    if (lb0) {
        } else {
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        lb0 = ad3 < ad4;
        ab1 = ab2 || ab3;
                ab4 = fb0 && fb1;
        fd0 = fd1 - ad1;
                lb0 = ab1 || ab2;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab2 = !ab3;
        ab4 = !fb0;
        boolean lb2 = false;
if(fo0 != null){
          fo0.m2(fb0, fb1, lb1, lb2);
}
        fd1 *= -1;
        ad1 *= -1;
        lb0 = ad2 > ad3;
        ab1 = ab2 || ab3;
        double ld3 = 924.8721563309964;
        boolean lb4 = true;
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
    fd1 = fd0 - fd1;
    Thought lo0 = Thought396.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought134.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    lb2 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 *= -1;
    fb1 = !lb2;
    Thought lo3 = Thought376.getInstance(fd1, fd0, fd1, fd0);
    boolean lb4 = true;
    lb4 = fd1 < fd0;
    boolean lb5 = true;
    lb5 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb6 = true;
        fd1 *= -1;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(lb2, lb4, lb5, lb6);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 935.7791067471586;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    double ld1 = 43.23485985228502;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ld0 *= -1;
        fb0 = fb1 && fb0;
    if (fb1) {
        boolean lb2 = false;
if(ao1 != null){
          ld1 = ao1.m3(ad1, ad2, ad3, ad4);
}
        lb2 = !fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);
}
        double ld3 = 411.40438846669775;
        ld1 = ad1 + ad2;
if(ao2 != null){
          fb1 = ao2.m2();
}
        ad3 = ad4 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(lb2, fb0, fb1, lb2);
}
        fb0 = fd1 < ld3;
        double ld4 = 18.485525019680267;
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
    double ld0 = 563.6982373341918;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ab2 = ld0 < fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    ab2 = !ab3;
    ad3 = ad4 - fd0;
    ab4 = fd1 > ad1;
    fb0 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 || ab2;
        ad4 = fd0 + fd1;
        double ld0 = 417.89356749772554;
if(ao2 != null){
          ab3 = ao2.m2(ld0, ad1, ad2, ad3);
}
        Output.points[8][2] -= ad4;
        fd0 = fd1 + ld0;
        ad1 = ad2 + ad3;
        double ld1 = 515.849349633516;
        double ld2 = 327.3616830994158;
        ab4 = ad2 < ad3;
}
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
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    Thought lo1 = Thought230.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;
    fb0 = fd0 > fd1;
        double ld3 = 502.9376005564361;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    Output.points[8][3] += fd1;
    boolean lb0 = true;
    fd0 *= -1;
        fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought20.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought234.getInstance(fd1, fd0, fd1, fd0);
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
        lb1 = !fb0;
    boolean lb2 = false;

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
