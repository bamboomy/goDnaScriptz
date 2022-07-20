package genetic;
import java.util.ArrayList;
class Thought34 extends Thought{
private static ArrayList<Thought34> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 857.3243049497161;
private double fd1 = 937.4110368242951;
private Thought fo0 = null;
private Thought fo1 = null;
Thought34 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought34 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought34 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought34 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought34 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
    fd0 *= -1;
    double ld0 = 625.2789005648391;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    lb1 = !fb0;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
    Output.points[0][6] -= fd1;
    fb1 = lb1 || fb0;
    fb1 = ld0 < fd0;
    lb1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fb1 && lb1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fb0, fb1, lb1, fb0);
}
    Output.points[0][7] += fd0;
    double ld2 = 675.9458093809508;
    fd0 = fd1 - ld0;
    Thought lo3 = Thought380.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
    Thought lo4 = Thought81.getInstance(ld2, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
    boolean lb5 = false;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, lb6, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought48.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought341.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab4 = fd1 < fd0;
    boolean lb2 = false;
    ab4 = fd1 > fd0;
    Output.points[0][8] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb3 = false;
    ab4 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb2, lb3);
}
    ab1 = fd0 > fd1;
    fd0 *= -1;
    boolean lb4 = false;
    double ld5 = 141.18764305284267;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld5, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb2;

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
    Thought lo0 = Thought379.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ad1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
    double ld1 = 18.323978485182646;
    fb1 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
    ad4 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ad1, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    double ld3 = 905.8812574724803;
        ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld3, ad1, ad2);
}
    lb2 = ad3 > ad4;
    fb0 = fd0 < fd1;
    ld1 *= -1;
    ld3 = ad1 - ad2;
    boolean lb4 = false;

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
        ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    fd1 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb0 = fd1 < ad1;
if(fo0 != null){
          fo0.m2(ab1, ab2, ab3, ab4);
}
        }
    ad2 = ad3 + ad4;
    fb0 = fb1 || lb0;
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    double ld0 = 131.18448928054113;
    fd0 = fd1 + ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb1 = false;
    fd0 = fd1 + ld0;
        Thought lo2 = Thought367.getInstance(fd0, fd1, ld0, fd0);
    double ld3 = 226.2972430988274;
    lb1 = fd0 < fd1;
    fb0 = ld0 < ld3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld3);
}
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      fd0 = ao4.m3(fb1, lb1, fb0, fb1);
}
    boolean lb4 = true;
    lb1 = !lb4;
    Thought lo5 = Thought138.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, ld3, fd0, fb0, fb1, lb1, lb4);
    Output.points[1][0] -= fd1;
    fb0 = !fb1;
    boolean lb6 = false;

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
    double ld0 = 531.353127286855;
    fb0 = !fb1;
    fb0 = ld0 < ad1;
    boolean lb1 = true;
    double ld2 = 396.59507302079675;
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    lb1 = fb0 && fb1;
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 - ad3;

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
    ab2 = ab3 || ab4;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = false;
    ab4 = fd0 > fd1;
if(ao3 != null){
      ao3.m3(fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    fd0 *= -1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[1][1] += fd0;
    Thought lo1 = Thought358.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;

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
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    ab2 = ad2 < ad3;
    ab3 = ab4 || fb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        boolean lb1 = false;
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
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fd1 *= -1;
        fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    if (lb0) {
        boolean lb1 = false;
        double ld2 = 295.39903901280763;
        boolean lb3 = true;
        ld2 = fd0 - fd1;
        lb3 = ld2 < fd0;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought310.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    ab3 = !ab4;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, lb1);
}
    lb2 = ab1 && ab2;
    boolean lb3 = true;
    double ld4 = 255.55113746122188;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought166.getInstance(fd1, ld4, fd0, fd1, fb1, lb1, lb2, lb3);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ld4 = fd0 + fd1;
    fb0 = ld4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld4, fd0, fd1);
}
    boolean lb7 = true;
    ab4 = fb0 && fb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[1][2] += ad1;
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    Output.points[1][3] += ad4;
    Thought lo0 = Thought338.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      ad3 = fo1.m3();
}
if(fo0 != null){
      ad4 = fo0.m3(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        Output.points[1][4] -= ad3;
        double ld1 = 698.6412315352342;
        boolean lb2 = true;
        Output.points[1][5] += ad3;
        double ld3 = 356.95033076640965;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
        ld1 *= -1;
        fb1 = lb2 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          lb2 = fo1.m2(ld3, ad1, ad2, ad3);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[1][6] -= fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
          fo1.m3();
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad4 < fd0;
        fd1 = ad1 + ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo0.m2(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb0 = true;
        Thought lo1 = Thought332.getInstance(ad3, ad4, fd0, fd1);
        ad1 *= -1;
        ad2 = ad3 - ad4;
        fb0 = fb1 || lb0;
        boolean lb2 = true;
        lb2 = ab1 && ab2;
        Output.points[1][7] -= fd0;
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
    double ld0 = 606.8077453823479;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    fb0 = ld0 < fd0;
if(ao3 != null){
      fd1 = ao3.m3(fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought104.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
    fb0 = !fb1;
    Output.points[1][8] += fd0;
    boolean lb3 = true;

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
    Thought lo0 = Thought175.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought367.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    lb2 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    lb2 = fb0 || fb1;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ab3 = fd1 > fd0;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    double ld0 = 11.263134005150995;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought201.getInstance(ad2, ad3, ad4, fd0);
        ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 358.57211126930923;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    boolean lb1 = true;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    ld0 = fd0 + fd1;
    fb0 = ld0 > fd0;
    fb1 = lb1 && fb0;
    Output.points[2][0] += fd1;

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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought263.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
        ab4 = fd0 > fd1;
    fb0 = fb1 && ab1;
    Thought lo1 = Thought37.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    if (fb1) {
        Thought lo2 = Thought173.getInstance(fd0, fd1, fd0, fd1);
        ab1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m1();
}
        if (ab2) {
            ab3 = ab4 || fb0;
            fb1 = ab1 && ab2;
            ab3 = ab4 && fb0;
            fd0 = fd1 - fd0;
if(fo0 != null){
              fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
}}
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
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 = ad4 - fd0;
    fb1 = !lb0;
    boolean lb1 = false;
    Thought lo2 = Thought199.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
    lb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = !lb0;
        fd1 = ad1 + ad2;
        ad3 = ad4 + fd0;
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        for(int i1=0; i1<10; i1++){
            lb0 = !lb1;
            fd1 = ad1 - ad2;
            fb0 = ad3 < ad4;
            boolean lb4 = false;
            boolean lb5 = false;
if(fo1 != null){
              lb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
            ad3 = ad4 - fd0;
            boolean lb6 = true;
            fd1 = ad1 - ad2;
            Output.points[2][1] -= ad3;
            ad4 = fd0 - fd1;
}}
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
    ab1 = ad2 > ad3;
    Output.points[2][2] -= ad4;
    fd0 = fd1 + ad1;
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
        double ld0 = 753.1512064681472;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        double ld1 = 950.1116657181617;
        boolean lb2 = true;
        ab1 = ab2 && ab3;
        fd0 *= -1;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo0 = fo1.m4();
}
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
    fb0 = !fb1;
    if (fb0) {
        boolean lb0 = false;
        } else if (fb1) {
        fb0 = fb1 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
if(ao3 != null){
          fb0 = ao3.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        Thought lo1 = Thought294.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
        boolean lb2 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        lb2 = fb0 && fb1;
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
    Thought lo0 = Thought25.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    fb0 = !fb1;
    fb0 = !fb1;
    double ld1 = 524.5906453153287;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m2(lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    Thought lo3 = Thought222.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, lb2, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
}
    fd1 *= -1;
    Thought lo4 = Thought77.getInstance(ao3, ao4, fo0, fo1);
    double ld5 = 111.44671012360342;
if(ao2 != null){
      ao1 = ao2.m4(ld1, ld5, ad1, ad2);
}
    fb0 = fb1 || lb2;
    Output.points[2][3] -= ad3;
    fb0 = ad4 > fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, ld5, ad1);
}
if(ao2 != null){
      ao2.m2();
}
    boolean lb6 = true;
    double ld7 = 4.351416171438624;
    ad1 *= -1;
if(ao3 != null){
      ao3.m1(lb2, lb6, fb0, fb1);
}
    lb2 = ad2 < ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, lb6, fb0, fb1, lb2);
}
    Output.points[2][4] -= ld5;
    Output.points[2][5] -= ld7;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab2 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        for(int i1=0; i1<10; i1++){
if(ao4 != null){
              fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
            boolean lb1 = false;
            boolean lb2 = true;
if(ao3 != null){
              ab2 = ao3.m2(fd0, fd1, fd0, fd1);
}
            fd0 = fd1 - fd0;
if(ao4 != null){
              fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
            ab3 = ab4 && fb0;
            fb1 = fd0 > fd1;
            for(int i2=0; i2<10; i2++){
                lb1 = fd0 > fd1;
                Thought lo3 = Thought78.getInstance();
                lb2 = lb0 && ab1;
                fd0 = fd1 + fd0;
                Output.points[2][6] -= fd1;
if(ao4 != null){
                  ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
                boolean lb4 = true;
                fb0 = fb1 || lb4;
                double ld5 = 637.5895302163647;
}}}
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
    ab2 = ad2 < ad3;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Output.points[2][7] -= ad3;
    ab1 = !ab2;
    double ld0 = 184.1890407896707;
    double ld1 = 776.019830630921;
    double ld2 = 292.55260068080446;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought378.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    double ld1 = 782.2980995967393;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
        fb1 = !lb0;
    fd0 *= -1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought131.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    fb0 = !fb1;

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
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
        double ld0 = 265.1872595855365;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Thought lo1 = Thought319.getInstance(fd0, fd1, ld0, fd0);
        fd1 *= -1;
        ld0 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
        ab3 = fd1 < ld0;
        fd0 = fd1 + ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo0.m1(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        ld0 = fd0 + fd1;
        Thought lo2 = Thought124.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
        Output.points[2][8] += fd0;
        boolean lb3 = true;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought35.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;

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
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    Output.points[3][0] -= ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    double ld0 = 44.61173726708128;
    boolean lb1 = false;
    fd0 *= -1;
    Output.points[3][1] -= fd1;
    ld0 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab3 = ad4 < fd0;
    Output.points[3][2] -= fd1;
    ld0 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    double ld2 = 239.0235410324253;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, ld2, ad1, ad2);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ab2 = !ab3;
    Thought lo3 = Thought156.getInstance(ld0, ld2, ad1, ad2, ab4, fb0, fb1, lb1);
    Thought lo4 = Thought71.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    ad3 = ad4 + fd0;
    fb0 = fb1 && lb1;

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
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Output.points[3][3] -= fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 > ad1;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo3 = Thought126.getInstance(ad2, ad3, ad4, fd0);
    Output.points[3][4] -= fd1;
    lb2 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m2();
}
    fb0 = fb1 || lb0;
    lb1 = !lb2;
    fb0 = fb1 && lb0;
    lb1 = ad1 > ad2;
    Output.points[3][5] -= ad3;
if(ao3 != null){
      ad4 = ao3.m3(lb2, fb0, fb1, lb0);
}
        double ld4 = 978.2032230702995;
    double ld5 = 678.5558917607391;
    ad3 = ad4 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld4, ld5, ad1, ad2, lb1, lb2, fb0, fb1);
}
    lb0 = ad3 > ad4;

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
    double ld0 = 810.1056504274005;
if(ao2 != null){
      ld0 = ao2.m3(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld0;
    Output.points[3][6] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 < fd0;
    Output.points[3][7] -= fd1;
        fb1 = !ab1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[3][8] += fd1;
if(fo0 != null){
          ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ab2 = ab3 && ab4;
        fb0 = ad1 > ad2;
        boolean lb0 = true;
        Thought lo1 = Thought286.getInstance(ad3, ad4, fd0, fd1);
        double ld2 = 476.00706855961903;
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3);
}
if(ao1 != null){
              ao1.m2();
}
            ad4 = fd0 + fd1;
            Thought lo3 = Thought39.getInstance(fb0, fb1, lb0, ab1);
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
            Output.points[4][0] += ad4;
            }
        double ld4 = 888.2999969791641;
if(ao2 != null){
          ad4 = ao2.m3(fd0, fd1, ld2, ld4, fb1, lb0, ab1, ab2);
}
        ad1 = ad2 + ad3;
        boolean lb5 = false;
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
    fb1 = fd1 > fd0;
    double ld0 = 613.0572049857002;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    lb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m1();
}
    ld0 = fd0 - fd1;
    fb1 = lb1 || fb0;
    fb1 = !lb1;

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
        fb1 = !fb0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Output.points[4][1] += fd1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 && lb0;
    lb1 = fb0 || fb1;

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
    double ld0 = 615.5833535198852;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    ld0 = fd0 - fd1;
    Thought lo2 = Thought225.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      lb1 = fo1.m2();
}
    boolean lb3 = true;
    fd1 = ld0 + fd0;
if(fo0 != null){
      lb3 = fo0.m2(fb0, fb1, lb1, lb3);
}
    fb0 = fd1 < ld0;
    boolean lb4 = false;

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
