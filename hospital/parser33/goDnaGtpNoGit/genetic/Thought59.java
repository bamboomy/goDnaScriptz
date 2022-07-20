package genetic;
import java.util.ArrayList;
class Thought59 extends Thought{
private static ArrayList<Thought59> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 390.8048866672232;
private double fd1 = 283.5455743089033;
private Thought fo0 = null;
private Thought fo1 = null;
Thought59 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought59 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought59 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought59 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought59 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought59 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought59 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought59 instance = new Thought59 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought266.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought375.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Thought lo3 = Thought182.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought208.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb5 = true;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 469.82788013886835;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ld0;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 > fd0;
    ab1 = ab2 || ab3;

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
    Output.points[0][4] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought134.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought369.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (fb1) {
        boolean lb2 = false;
        double ld3 = 331.52643221899825;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
        boolean lb4 = false;
        lb4 = !fb0;
        fb1 = !lb2;
        lb4 = fb0 && fb1;
        lb2 = !lb4;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, fb0, fb1, lb2, lb4);
}
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld3, fb0, fb1, lb2, lb4);
}
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb4);
}
        fb0 = fb1 || lb2;
        Thought lo5 = Thought355.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fo0.m2(ad4, fd0, fd1, ld3);
}
        ad1 = ad2 - ad3;
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    Output.points[0][5] += fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
        lb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m2(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    ad1 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    Thought lo0 = Thought346.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = fb1 && fb0;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    fb1 = !lb1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fd0 > fd1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[0][6] -= fd0;
    fb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 < fd0;
        double ld3 = 808.5556386945665;
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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
        fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fb0 = fb1 && lb0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 *= -1;
    Thought lo1 = Thought44.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);

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
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
    double ld0 = 19.54210835247733;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    Thought lo1 = Thought351.getInstance();
if(ao2 != null){
      ao2.m1(fb1, ab1, ab2, ab3);
}
    ld0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > ld0;
    ab3 = !ab4;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought102.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
    Output.points[0][7] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ld0 = fd0 - fd1;
    ab2 = !ab3;
    ab4 = !fb0;
    fb1 = ab1 || ab2;

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
    Output.points[0][8] += ad1;
    boolean lb0 = false;
    boolean lb1 = true;
    ad2 *= -1;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
          ao2.m1(lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    double ld3 = 857.8608764569143;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
    Thought lo2 = Thought342.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = fb0 || fb1;
    Output.points[1][0] -= fd1;
    Output.points[1][1] += fd0;
    boolean lb3 = false;
    fd1 *= -1;

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
    Thought lo0 = Thought243.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought207.getInstance();
    ab2 = ab3 || ab4;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought376.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        }
    fd0 = fd1 - fd0;
    boolean lb3 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = !ab3;
    Output.points[1][2] -= fd0;
    Output.points[1][3] -= fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought394.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fb1, lb3, ab1, ab2);
}
    fd0 = fd1 - fd0;
    ab3 = ab4 && fb0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 > ad1;
    Output.points[1][4] += ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought281.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    fb0 = fd0 > fd1;
    double ld2 = 222.15880033258412;
    fb1 = ld2 < ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 441.2323988362925;
    double ld1 = 878.0759234235256;
    Thought lo2 = Thought361.getInstance(ab4, fb0, fb1, ab1);
    ad2 = ad3 + ad4;
    Output.points[1][5] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ld0 = ld1 - ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ad1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3();
}
    ab1 = ad4 < fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought326.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    double ld1 = 175.1315420596032;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
        double ld2 = 399.65855485427556;
    ld1 = ld2 - fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ad2 < ad3;
    Output.points[1][6] -= ad4;
    Thought lo1 = Thought181.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      ad3 = fo1.m3();
}
    fb0 = fb1 || lb0;
    ad4 = fd0 - fd1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb0, fb0, fb1);
}
    Output.points[1][7] -= ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
    double ld1 = 84.75318922128531;
    boolean lb2 = true;
    fd0 = fd1 + ld1;
    ab2 = fd0 < fd1;
        ab3 = ld1 < fd0;
    fd1 = ld1 + fd0;
    ab4 = !fb0;
    fb1 = fd1 > ld1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb3 = false;
    boolean lb4 = true;
    boolean lb5 = false;
    fd1 *= -1;
    lb0 = ld1 > fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(ld1, fd0, fd1, ld1);
}
        Output.points[1][8] += fd0;
if(fo0 != null){
          lb2 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
}
        lb3 = lb4 || lb5;
        ld1 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
return ab1;
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
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ad4 = ao2.m3();
}
    Thought lo0 = Thought378.getInstance(ab4, fb0, fb1, ab1);
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    ab1 = !ab2;
    ad3 = ad4 - fd0;
    boolean lb1 = true;
    Thought lo2 = Thought306.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;
    ad4 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2();
}
    double ld1 = 815.9078972003974;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > ld1;
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
    ld1 = fd0 - fd1;
    Thought lo3 = Thought301.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    double ld4 = 456.7909601914511;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, ld4, fd0, fd1);
}
    ld1 = ld4 - fd0;
    double ld5 = 496.3218136222759;
    double ld6 = 689.5860140557495;

Thought.STACK_COUNTER++;
return ld6;
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
    double ld0 = 290.3891604218395;
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (ab2) {
        } else {
        ld0 = fd0 - fd1;
        ld0 *= -1;
        double ld1 = 461.18450877685547;
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld0, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
        ld1 *= -1;
        Thought lo2 = Thought388.getInstance(ld0, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
        ld0 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
        double ld3 = 326.31107958852203;
        ab2 = ab3 || ab4;
        fb0 = ld1 > ld3;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, ld3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld1);
}
        boolean lb4 = true;
        fb0 = !fb1;
        boolean lb5 = true;
if(fo0 != null){
          lb4 = fo0.m2();
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    Output.points[2][0] += ad4;
    fb0 = fd0 < fd1;
    if (fb1) {
        Thought lo0 = Thought183.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
        fb0 = fd0 > fd1;
        fb1 = fb0 && fb1;
        fb0 = fb1 || fb0;
        ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        double ld1 = 317.49942637273125;
        Output.points[2][1] -= ad1;
        fb1 = ad2 < ad3;
        fb0 = !fb1;
        Output.points[2][2] -= ad4;
        Output.points[2][3] -= fd0;
        double ld2 = 859.4810279974812;
        boolean lb3 = false;
        lb3 = fb0 && fb1;
        lb3 = fb0 && fb1;
        lb3 = fb0 || fb1;
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
    ab1 = ab2 || ab3;
    if (ab4) {
        fb0 = fb1 && ab1;
        boolean lb0 = false;
        Thought lo1 = Thought9.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
        double ld2 = 670.064389232884;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1);
}
        ad2 = ad3 - ad4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
if(ao2 != null){
      fd0 = ao2.m3();
}
    boolean lb0 = false;
    double ld1 = 652.2562827088757;
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !lb0;
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
        fd0 = fd1 + ld1;
        fb1 = lb0 && fb0;
        fb1 = lb0 && fb0;
        fb1 = lb0 && fb0;
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
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    double ld1 = 670.3904846110263;
    ld1 *= -1;
    Output.points[2][4] += ad1;
    double ld2 = 145.8511483455593;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    boolean lb3 = true;
    lb3 = ld1 > ld2;
    fb0 = ad1 < ad2;

Thought.STACK_COUNTER++;
return ad3;
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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    double ld1 = 634.7317112381124;
if(fo0 != null){
      ao4 = fo0.m4();
}
    ld1 *= -1;
    boolean lb2 = true;
    lb2 = ab1 || ab2;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, lb0, lb2, ab1, ab2);
}
    double ld3 = 917.4795596602438;
    ab3 = !ab4;
    fb0 = ld1 > ld3;
    fb1 = lb0 || lb2;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ld3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought53.getInstance(fd1, ad1, ad2, ad3);
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[2][5] += ad3;
    ab1 = ad4 < fd0;
if(ao1 != null){
      ao1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;

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
    Thought lo0 = Thought52.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld1 = 229.08545244567335;
    ld1 = fd0 - fd1;
    double ld2 = 267.09664622080624;
if(fo1 != null){
      ld1 = fo1.m3(ld2, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    fb0 = fb1 && lb3;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld2, fd0);
}
    lb4 = fb0 && fb1;
    double ld5 = 376.7710250872721;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld2, ld5);
}
    boolean lb6 = false;
    Output.points[2][6] -= fd0;
    fd1 = ld1 - ld2;
    ld5 = fd0 + fd1;
if(fo1 != null){
      lb3 = fo1.m2();
}
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb4, lb6, fb0, fb1);
}
    ld2 = ld5 + fd0;

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
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    Thought lo0 = Thought319.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    Thought lo1 = Thought138.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = !fb0;
    fd0 *= -1;
    Output.points[2][7] -= fd1;
    fb1 = fd0 < fd1;
    ab1 = fd0 > fd1;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb2, ab1);
}
    double ld3 = 184.27174244034177;
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;

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
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 251.94527454328096;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2);
}
    Thought lo2 = Thought231.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);

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
    ab2 = ab3 && ab4;
        fb0 = !fb1;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    double ld0 = 194.04224830541423;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ld0;
    ad1 = ad2 + ad3;
    ab2 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld0 = 826.070566562148;
    boolean lb1 = false;
    Thought lo2 = Thought167.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 - ld0;
        Output.points[2][8] += fd0;
    Thought lo3 = Thought354.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
if(ao4 != null){
      ld0 = ao4.m3();
}
    Output.points[3][0] += fd0;
    double ld4 = 96.75722950677742;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(lb1, fb0, fb1, lb1);
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
    ad1 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = ad2 < ad3;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    Output.points[3][1] -= fd0;
    Thought lo0 = Thought16.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    double ld2 = 402.042293075134;
    double ld3 = 694.4127306588491;
    boolean lb4 = false;
    ad2 = ad3 + ad4;
    boolean lb5 = true;
    boolean lb6 = false;
    fd0 = fd1 + ld2;
    lb4 = ld3 < ad1;
    lb5 = !lb6;
    boolean lb7 = true;
    lb7 = !fb0;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb1, lb4, lb5);
}
    for(int i0=0; i0<10; i0++){
        lb6 = !lb7;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fb0 = !fb1;
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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought384.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fd1 *= -1;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = lb1 && ab1;
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][2] += ad2;
    ab2 = ab3 || ab4;
if(ao2 != null){
      fb0 = ao2.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    double ld0 = 751.2180237713701;
    Output.points[3][3] -= ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
    fb0 = fb1 && ab1;
    if (ab2) {
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 > ld0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
        ab3 = ab4 && fb0;
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        double ld1 = 305.1312744174227;
        ad1 = ad2 + ad3;
        fb1 = ad4 > fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld1, ld0, ad1);
}
        Output.points[3][4] += ad2;
if(fo0 != null){
          ab1 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
        boolean lb2 = false;
        Thought lo3 = Thought188.getInstance();
if(ao4 != null){
          ao4.m3(ab1, ab2, ab3, ab4);
}
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
    double ld0 = 10.928386690887809;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Output.points[3][5] -= ld0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought90.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    double ld2 = 356.28451097331146;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[3][6] -= ld0;
    ld2 = fd0 + fd1;
    ld0 *= -1;
    fb0 = ld2 > fd0;

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
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    double ld0 = 284.15638096722734;
    Output.points[3][7] -= fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb1 = fb0 && fb1;
        ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    double ld1 = 842.2593683937847;
    fb0 = !fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    Output.points[3][8] += ld0;
    boolean lb4 = true;
    ld1 = fd0 - fd1;
    ld0 = ld1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(lb2, lb3, lb4, fb0);
}
    Thought lo5 = Thought335.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb1, lb2, lb3, lb4);
if(fo1 != null){
      fo1.m2(ld0, ld1, fd0, fd1, fb0, fb1, lb2, lb3);
}
    lb4 = ld0 < ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
}
    lb4 = !fb0;
    boolean lb6 = true;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fo1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fb0 = !fb1;
    lb0 = !fb0;
    fd0 *= -1;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        lb0 = !fb0;
    Output.points[4][0] += fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;

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
