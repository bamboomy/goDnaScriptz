package genetic;
import java.util.ArrayList;
class Thought232 extends Thought{
private static ArrayList<Thought232> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 985.7906066457068;
private double fd1 = 41.02745577702137;
private Thought fo0 = null;
private Thought fo1 = null;
Thought232 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought232 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought232 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought232 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought232 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought232 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought232 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought232 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought232 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought232 instance = new Thought232 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought232 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought232 instance = new Thought232 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought232 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought232 instance = new Thought232 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought232 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought232 instance = new Thought232 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought232 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought232 instance = new Thought232 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought232 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought232 instance = new Thought232 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought232 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought232 instance = new Thought232 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought232 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought232 instance = new Thought232 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    lb1 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !lb0;
if(fo0 != null){
      fd0 = fo0.m3(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fd1 > fd0;
    fb1 = lb0 && lb1;
    fd1 *= -1;
    Output.points[5][7] += fd0;
    fb0 = !fb1;
    lb0 = !lb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[5][8] -= fd1;

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
      ab1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 488.46826352920897;
    boolean lb1 = false;
    ab1 = ld0 > fd0;
    fd1 = ld0 + fd0;
    ab2 = fd1 > ld0;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo0 != null){
      ab1 = fo0.m2();
}
    boolean lb4 = true;

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
    ad2 = ad3 - ad4;
    Thought lo0 = Thought55.getInstance(fb0, fb1, fb0, fb1);
    Output.points[6][0] += fd0;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    lb1 = ad4 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = true;
    double ld4 = 4.18996554261869;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, lb3, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[6][1] -= ad3;
    boolean lb5 = true;

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
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    Output.points[6][2] -= fd1;
    Output.points[6][3] -= ad1;
    boolean lb0 = true;
    Thought lo1 = Thought280.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    lb0 = fd1 < ad1;
    ab1 = ad2 > ad3;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
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
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld0 = 825.0358982467524;
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld0;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1);
}
    fb0 = ld0 > fd0;
    fb1 = fd1 < ld0;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
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
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    Thought lo0 = Thought67.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    Output.points[6][4] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought22.getInstance(ao1, ao2, ao3, ao4);
    Thought lo2 = Thought184.getInstance(ad1, ad2, ad3, ad4);
    Thought lo3 = Thought1.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
if(ao3 != null){
      ad3 = ao3.m3();
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ad4 = ao4.m3(fb0, fb1, fb0, fb1);
}
    boolean lb4 = false;
    fd0 *= -1;
if(fo0 != null){
      lb4 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, lb4, fb0);
}
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2, fb1, lb4, fb0, fb1);
}
    double ld5 = 557.9482249875286;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, lb4, fb0, fb1, lb4);
}
    Thought lo6 = Thought312.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ld5 = ad1 + ad2;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ld5 = ao3.m3();
}
if(ao4 != null){
      ao4.m1(fb1, lb4, fb0, fb1);
}
if(fo0 != null){
      lb4 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb4, fb0);
}
    boolean lb7 = true;

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
    Thought lo1 = Thought331.getInstance(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld3 = 155.1107984719705;
    ld3 = fd0 + fd1;
    ld3 = fd0 - fd1;
    ld3 = fd0 - fd1;
if(fo1 != null){
      lb2 = fo1.m2(ld3, fd0, fd1, ld3);
}
    Output.points[6][5] -= fd0;
    boolean lb4 = false;
    Thought lo5 = Thought142.getInstance(ao1, ao2, ao3, ao4, fd1, ld3, fd0, fd1);
    boolean lb6 = false;
if(fo0 != null){
      ld3 = fo0.m3();
}
    Thought lo7 = Thought170.getInstance(lb4, lb6, ab1, ab2);
    boolean lb8 = true;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    double ld9 = 278.5870755982608;
    lb0 = lb2 || lb4;
    ld9 *= -1;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    fb0 = !fb1;
if(ao3 != null){
      ao3.m2();
}
    Thought lo2 = Thought264.getInstance(lb0, lb1, ab1, ab2);
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ad1, lb0, lb1, ab1, ab2);
}
        ab3 = ad2 < ad3;
        Thought lo3 = Thought242.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
        boolean lb4 = true;
        Output.points[6][6] -= ad4;
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
    fd0 *= -1;
        double ld0 = 338.8989939157092;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    boolean lb1 = false;
    fb0 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    Output.points[6][7] -= fd1;
    ld0 = fd0 + fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab1 = fo1.m2();
}
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought354.getInstance(fb1, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought83.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    Output.points[6][8] += fd0;
    ab3 = fd1 > fd0;
    double ld2 = 546.3898979534281;

Thought.STACK_COUNTER++;
return ab4;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad4 *= -1;
        double ld0 = 499.35512338207565;
        ad4 = fd0 - fd1;
        ld0 = ad1 + ad2;
        }
    Output.points[7][0] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[7][1] -= fd0;
    fb0 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[7][2] += ad3;
    ad4 = fd0 + fd1;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought87.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
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
    ad1 = ad2 + ad3;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[7][3] += ad4;
    Output.points[7][4] += fd0;
    boolean lb0 = false;
    boolean lb1 = true;
    fd1 *= -1;
    double ld2 = 511.08249858885864;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    boolean lb3 = false;
    ld2 = ad1 + ad2;
    lb1 = lb3 && ab1;
        ab2 = ad3 > ad4;
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ad4 = fd0 - fd1;
    ld2 *= -1;
    boolean lb4 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought166.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    Thought lo2 = Thought304.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
    boolean lb3 = true;
    fd0 = fd1 + fd0;
    boolean lb4 = false;
    lb4 = fb0 && fb1;
    boolean lb5 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Thought lo0 = Thought199.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    ad1 *= -1;
    lb1 = fb0 || fb1;
if(ao1 != null){
      lb1 = ao1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld2 = 837.7188784133142;
    fd0 = fd1 + ld2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 752.2451708113426;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought71.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = ld0 > fd0;
    ab4 = fd1 < ld0;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Output.points[7][5] -= fd0;
        double ld0 = 143.65882241899553;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ab2 = ab3 && ab4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ad1);
}
    fb0 = ad2 > ad3;
    fb1 = ab1 || ab2;
    boolean lb1 = false;
    double ld2 = 728.5607833576503;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = !ab3;
    Thought lo3 = Thought52.getInstance(ab4, fb0, fb1, lb1);
    ab1 = ld0 < ld2;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    lb1 = fd0 > fd1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought263.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fd0 *= -1;
    fb0 = fb1 && fb0;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab2 = fd0 < fd1;
    Output.points[7][6] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (ab3) {
        fd1 = fd0 + fd1;
        ab4 = fd0 > fd1;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo1.m1(fb1, ab1, ab2, ab3);
}
        double ld0 = 453.2282565708649;
        ld0 = fd0 + fd1;
        boolean lb1 = false;
        ld0 *= -1;
        ab3 = ab4 || fb0;
        fd0 = fd1 - ld0;
        fb1 = fd0 > fd1;
        ld0 = fd0 + fd1;
        ld0 = fd0 + fd1;
        lb1 = ld0 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
        boolean lb2 = false;
        ld0 *= -1;
        ab4 = fd0 < fd1;
if(fo0 != null){
          fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + ld0;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    if (lb1) {
        double ld2 = 262.2656071602241;
        boolean lb3 = true;
        ad2 = ad3 + ad4;
if(fo0 != null){
          fo0.m2();
}
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb3);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
        lb3 = !lb0;
        Thought lo4 = Thought105.getInstance(ad4, fd0, fd1, ld2, lb1, fb0, fb1, lb3);
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
    ad1 = ad2 - ad3;
    ad4 *= -1;
    Output.points[7][7] -= fd0;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    Thought lo0 = Thought195.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    double ld1 = 393.0960016501125;
    double ld2 = 871.5481555587885;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    Thought lo3 = Thought286.getInstance(ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    double ld4 = 404.92328874001123;
    ab4 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld2, ld4);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 && ab1;
            ad1 *= -1;
}}
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
    double ld0 = 492.222944623583;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    fd1 *= -1;
    ld0 *= -1;
if(ao1 != null){
      ao1.m1();
}
    boolean lb3 = true;
    lb1 = lb2 && lb3;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, lb1, lb2);
}
    lb3 = fd1 > ld0;
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    Thought lo4 = Thought51.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, lb1, lb2, lb3, fb0);
if(ao1 != null){
      ao1.m1(fd1, ld0, fd0, fd1, fb1, lb1, lb2, lb3);
}
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb1, lb2, lb3, fb0);
}
    double ld5 = 427.18431446029086;
    fb1 = lb1 || lb2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ld0 = ld5 - fd0;
    Thought lo6 = Thought382.getInstance(fd1, ld0, ld5, fd0);
    fd1 = ld0 - ld5;
    fd0 = fd1 + ld0;
    ld5 *= -1;

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
    boolean lb0 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb0 = fb0 || fb1;
    Output.points[7][8] += fd1;
    lb0 = ad1 > ad2;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb0);
}
    ad3 *= -1;
    lb1 = ad4 > fd0;
        fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought63.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = fd1 < fd0;
    ab4 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        boolean lb1 = false;
        ab4 = fb0 || fb1;
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        lb1 = fd0 > fd1;
        ab1 = ab2 && ab3;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        double ld2 = 142.3351950140009;
        ab4 = ld2 < fd0;
        Output.points[8][0] -= fd1;
        ld2 = fd0 + fd1;
if(ao2 != null){
          ao2.m2();
}
        fb0 = !fb1;
if(ao4 != null){
          ao3 = ao4.m4(lb1, ab1, ab2, ab3);
}
        double ld3 = 375.4032767983335;
if(fo0 != null){
          ld2 = fo0.m3(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld2, ab4, fb0, fb1, lb1);
}
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
    double ld0 = 55.92146820090662;
    ld0 = ad1 + ad2;
if(ao2 != null){
      ao2.m1(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 > ad1;
    ab1 = ad2 < ad3;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    Output.points[8][1] -= fd1;
    ab4 = !fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought228.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb3, fb0, fb1);
}
    lb0 = lb1 && lb3;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    lb3 = fd1 > fd0;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    Output.points[8][2] -= fd0;

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
    double ld0 = 371.9031506794463;
    Output.points[8][3] += fd0;
    Thought lo1 = Thought110.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    double ld2 = 282.1646947832188;
    fb0 = fd0 < fd1;
    ld0 = ld2 + fd0;
    double ld3 = 622.0085368771838;
    boolean lb4 = false;
    fd0 = fd1 - ld0;
    Thought lo5 = Thought239.getInstance(fo1, fo0, fo1, fo0);
    Thought lo6 = Thought133.getInstance(ld2, ld3, fd0, fd1);
    ld0 = ld2 + ld3;
    fb0 = !fb1;
    lb4 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
        boolean lb7 = false;
    ld3 = fd0 - fd1;
    double ld8 = 60.84562188978737;
if(fo1 != null){
      ld0 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld2, ld3, ld8, fd0, fb1, lb4, lb7, ab1);
}
    ab2 = fd1 < ld0;

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
    Output.points[8][4] += ad2;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    double ld0 = 960.0557286134683;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    Thought lo1 = Thought204.getInstance(ld0, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    fb0 = ad1 > ad2;
    ad3 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought276.getInstance(fb0, fb1, lb2, fb0);
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
    fb0 = fd1 < ld0;
    fb1 = lb2 || fb0;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    double ld0 = 286.71333891497676;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
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
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    double ld1 = 185.50247651172052;
    ld1 *= -1;
    Thought lo2 = Thought19.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = !fb1;
    ld1 *= -1;
    fd0 = fd1 + ld1;
    lb0 = fd0 < fd1;
    double ld3 = 714.2665345960062;
    fb0 = ld1 < ld3;
if(ao1 != null){
      fb1 = ao1.m2(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld3, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld1, ld3, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
        fd1 *= -1;
if(ao2 != null){
          fb1 = ao2.m2(ld1, ld3, fd0, fd1);
}
        boolean lb4 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ld3, fd0, fd1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
    ad3 = ad4 + fd0;
    if (lb1) {
        lb2 = fb0 && fb1;
        lb0 = fd1 < ad1;
        ad2 *= -1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ad3 = ad4 + fd0;
        lb1 = !lb2;
if(ao4 != null){
          ao4.m3(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
}
        boolean lb3 = false;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ad1, ad2, lb0, lb1, lb2, fb0);
}
        if (fb1) {
if(fo1 != null){
              ad3 = fo1.m3(ao1, ao2, ao3, ao4, lb3, lb0, lb1, lb2);
}
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
              ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
            boolean lb4 = true;
            lb2 = ad3 < ad4;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
            boolean lb5 = false;
            boolean lb6 = true;
            Output.points[8][5] -= ad3;
            ad4 = fd0 - fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 603.4648547636543;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Output.points[8][6] += ld0;
    Thought lo1 = Thought229.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
    double ld2 = 805.7513344296224;
if(ao4 != null){
      ab3 = ao4.m2(fd0, fd1, ld0, ld2, ab4, fb0, fb1, ab1);
}
        double ld3 = 540.3423179967346;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    boolean lb4 = true;
    Thought lo5 = Thought362.getInstance(fo0, fo1, ao1, ao2);
    ld3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, ld2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld0);
}
    boolean lb6 = true;
    ld2 = ld3 + fd0;
    fb0 = fb1 || lb4;
    fd1 = ld0 - ld2;
    ld3 = fd0 + fd1;
    ld0 *= -1;
    Thought lo7 = Thought116.getInstance();
if(ao4 != null){
      ld2 = ao4.m3(lb6, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld0, ab4, fb0, fb1, lb4);
}
if(fo0 != null){
      ao4 = fo0.m4(ld2, ld3, fd0, fd1, lb6, ab1, ab2, ab3);
}
    double ld8 = 761.3225854808346;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb4, lb6, ab1, ab2);
}
    ld0 = ld2 - ld3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought255.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
    ab4 = !fb0;
    double ld1 = 309.795997226385;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb2 = true;
    fd0 = fd1 - ld1;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb2, ab1, ab2);
}
    double ld3 = 659.5306978825369;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
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
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && fb0;
    double ld1 = 737.7018713877068;
    fb1 = ld1 < fd0;
    fd1 = ld1 - fd0;
    fd1 = ld1 - fd0;
    lb0 = fd1 > ld1;
    Thought lo2 = Thought143.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
    double ld3 = 15.150257235932886;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    Output.points[8][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
    Output.points[8][8] += fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought283.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 496.18608609174606;
    double ld2 = 944.7812298987288;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(ld2, fd0, fd1, ld1, fb0, fb1, lb3, fb0);
}
    ld2 = fd0 + fd1;
    ld1 *= -1;
    fb1 = lb3 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb3, fb0, fb1);
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
