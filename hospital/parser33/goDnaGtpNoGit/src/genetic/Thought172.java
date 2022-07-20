package genetic;
import java.util.ArrayList;
class Thought172 extends Thought{
private static ArrayList<Thought172> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 640.7136633735871;
private double fd1 = 316.0964918561966;
private Thought fo0 = null;
private Thought fo1 = null;
Thought172 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought172 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought172 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought172 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought172 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought172 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought172 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought172 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought172 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought172 instance = new Thought172 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought172 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought172 instance = new Thought172 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought172 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought172 instance = new Thought172 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought172 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought172 instance = new Thought172 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought172 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought172 instance = new Thought172 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought172 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought172 instance = new Thought172 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought172 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought172 instance = new Thought172 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought172 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought172 instance = new Thought172 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
        double ld0 = 115.73180618873509;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
    double ld1 = 369.4868910864576;
    fb0 = !fb1;
    double ld2 = 21.10405409851605;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    lb3 = !fb0;
    double ld4 = 479.43142273098056;
    boolean lb5 = true;
    ld0 = ld1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4();
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
    ab1 = fd1 > fd0;
    Thought lo0 = Thought15.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    fd1 = fd0 - fd1;
    double ld1 = 127.50447333456238;
    ab3 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    Output.points[8][1] += fd0;
    double ld3 = 486.9292597927216;
    boolean lb4 = false;
    fd0 = fd1 + ld1;
    ld3 *= -1;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3);
}
    fd0 = fd1 - ld1;

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
      fo1 = fo0.m4();
}
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    if (lb0) {
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo1.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
            lb0 = ad3 > ad4;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
            ad3 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
              ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
            Output.points[8][2] -= fd0;
            double ld1 = 512.137894071082;
            lb0 = !fb0;
            fb1 = lb0 && fb0;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ld1, ad1);
}
            double ld2 = 100.9261205681223;
            boolean lb3 = true;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
            Output.points[8][3] += fd0;
            fd1 = ld1 - ld2;
            fb0 = ad1 > ad2;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        lb0 = ab1 || ab2;
if(fo1 != null){
          ad1 = fo1.m3();
}
        double ld1 = 500.54972020756077;
        Output.points[8][4] += ad1;
        boolean lb2 = false;
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, lb2, ab1, ab2);
}
if(fo0 != null){
          fo0.m3(fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        lb0 = ad3 < ad4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
        boolean lb3 = true;
        fd0 *= -1;
        boolean lb4 = true;
        double ld5 = 359.46441695529944;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - ld1;
        boolean lb6 = false;
        Output.points[8][5] += ld5;
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
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    double ld1 = 57.84389023133473;
    Output.points[8][6] -= ld1;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      lb0 = ao4.m2(lb2, fb0, fb1, lb0);
}
    boolean lb3 = false;

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
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought392.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
    ad3 = ad4 + fd0;
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[8][7] -= fd1;
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb2);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 && lb0;
    boolean lb3 = false;
    Output.points[8][8] += ad4;
    if (lb2) {
        Thought lo4 = Thought161.getInstance(fd0, fd1, ad1, ad2);
        lb3 = ad3 > ad4;
        fd0 = fd1 + ad1;
        fb0 = fb1 && lb0;
        for(int i0=0; i0<10; i0++){
            ad2 = ad3 + ad4;
if(fo0 != null){
              fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
            boolean lb5 = false;
            lb0 = lb2 || lb3;
            ad3 = ad4 - fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][0] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
    Output.points[0][1] += fd0;
    Thought lo0 = Thought276.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fd1 *= -1;
    boolean lb1 = true;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    lb1 = !ab1;
    ab2 = !ab3;
    ab4 = fd1 < fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    fd0 = fd1 - fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    Output.points[0][2] -= ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought365.getInstance(ao4, fo0, fo1, ao1);
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ab4 = ad3 > ad4;
    fb0 = fd0 > fd1;
        fb1 = ab1 && ab2;

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb0 = fo1.m2();
}
    Thought lo1 = Thought279.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;

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
    ab2 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought49.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb1 = fd1 < fd0;
if(fo0 != null){
          fo0.m1();
}
    Thought lo2 = Thought140.getInstance(ab1, ab2, ab3, ab4);
    Thought lo3 = Thought147.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
        Thought lo4 = Thought114.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 > fd0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[0][3] += fd1;
    fb1 = lb1 || ab1;
    boolean lb5 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo6 = Thought178.getInstance();
    fd0 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    boolean lb0 = true;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    boolean lb3 = false;
    ad2 = ad3 - ad4;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        ad2 = ad3 - ad4;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2();
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb2, ab1);
}
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Output.points[0][4] += fd0;
    lb0 = !lb1;
    lb2 = ab1 && ab2;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb0 = !lb1;
    lb2 = ab1 || ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 - ad2;
    Thought lo3 = Thought294.getInstance(ad3, ad4, fd0, fd1);
    Thought lo4 = Thought225.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        double ld0 = 956.0739364547576;
        double ld1 = 336.226916173813;
        fb1 = ld0 > ld1;
if(ao2 != null){
          fb0 = ao2.m2();
}
        double ld2 = 488.0881874871999;
        Output.points[0][5] += ld2;
        fb1 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
        Thought lo3 = Thought223.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
        fb0 = ld2 < fd0;
        fb1 = fb0 || fb1;
        Output.points[0][6] += fd1;
        fb0 = ld0 > ld1;
        fb1 = !fb0;
        ld2 = fd0 - fd1;
        ld0 *= -1;
        fb1 = ld1 < ld2;
        double ld4 = 935.8735801798113;
if(ao3 != null){
          ld4 = ao3.m3(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ld2 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought164.getInstance(ad2, ad3, ad4, fd0);
    double ld1 = 141.71767954876768;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
}
    ad2 = ad3 + ad4;
    Output.points[0][7] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld2 = 835.6590215885969;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld1 - ld2;
    Thought lo3 = Thought357.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    fb1 = ad1 < ad2;
    fb0 = !fb1;
    fb0 = ad3 < ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
        ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought296.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
    double ld1 = 925.0938546223631;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    Thought lo1 = Thought392.getInstance();
    double ld2 = 130.52838620175686;
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - ld2;
    ab3 = ad1 < ad2;
    Thought lo3 = Thought324.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
    ld2 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld4 = 678.4897593947961;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld4, ad1, ad2, ad3);
}
    Thought lo5 = Thought176.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ld4, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Thought lo6 = Thought211.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
        fb1 = lb0 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb1 = fd0 < fd1;
    Thought lo2 = Thought132.getInstance();
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb0);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 801.1654562094086;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd0 < fd1;
    ld0 *= -1;
    ab4 = !fb0;
    fb1 = fd0 < fd1;
    double ld1 = 380.17634254249464;
    boolean lb2 = false;
    ld0 = ld1 - fd0;
    lb2 = fd1 < ld0;
    ld1 *= -1;
    ab1 = fd0 > fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld0 = 637.1713125293663;
if(fo1 != null){
      fo1.m3();
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + ld0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought337.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;

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
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought173.getInstance(fo0, fo1, fo0, fo1);
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb1 = ab1 && ab2;
    boolean lb1 = false;
    ad2 *= -1;
    ad3 *= -1;
    Output.points[0][8] += ad4;
    fd0 *= -1;
    ab2 = !ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    Output.points[1][0] -= fd0;
    double ld2 = 288.6737472262092;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 609.5928276501302;
    ld0 = fd0 - fd1;
    fb0 = !fb1;
    ld0 *= -1;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    fb1 = fd0 > fd1;
if(ao2 != null){
      ld0 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 *= -1;
    fb0 = fd1 > ld0;
    Output.points[1][1] += fd0;
    fd1 = ld0 - fd0;
    fb1 = !fb0;
    Thought lo1 = Thought68.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought375.getInstance(ao2, ao3, ao4, fo0);
    Thought lo1 = Thought327.getInstance(ad2, ad3, ad4, fd0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = true;
    boolean lb3 = false;
if(ao2 != null){
      ad4 = ao2.m3(lb3, fb0, fb1, lb2);
}
    lb3 = fd0 < fd1;
    ad1 *= -1;

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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought313.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ab4 = ao4.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab4 = fd0 < fd1;
        } else {
        boolean lb2 = false;
        Thought lo3 = Thought330.getInstance(ab4, fb0, fb1, lb2);
        boolean lb4 = true;
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    ab3 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
        ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    Output.points[1][2] -= ad1;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Thought lo1 = Thought369.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
if(ao2 != null){
      fd0 = ao2.m3();
}
    fd1 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(fb1, lb0, ab1, ab2);
}
    boolean lb2 = false;
    ad2 = ad3 + ad4;
    boolean lb3 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought193.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought127.getInstance(fo0, fo1, fo0, fo1);
        boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb2 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      lb3 = fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb2, lb3);
}
    double ld4 = 736.4341930938263;
    ld4 = fd0 + fd1;

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
    double ld0 = 149.37837955966592;
    Thought lo1 = Thought73.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 > ld0;
        fd0 *= -1;
        Thought lo2 = Thought298.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
        ab3 = fd1 < ld0;
        fd0 = fd1 - ld0;
        double ld3 = 57.149551072945876;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld3);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2();
}
    Output.points[1][3] -= fd1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
    lb1 = !fb0;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb2, fb0, fb1, lb0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb1, lb2, lb3, fb0);
}
    fb1 = lb0 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
    lb0 = fd1 < ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
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
    double ld0 = 950.045078429363;
    ld0 = ad1 - ad2;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought396.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
    boolean lb2 = true;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    double ld3 = 830.2983674439955;
    ld3 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought335.getInstance(ab1, ab2, ab3, ab4);
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb2, ab1);
}
    ld3 = ad1 - ad2;
    if (ab2) {
        double ld5 = 450.9116294682368;
        if (ab3) {
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    fb0 = fd0 > fd1;
    Thought lo0 = Thought29.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 644.3890648440025;
    fb0 = ld1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m2(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
        fb0 = fd0 > fd1;
        boolean lb3 = true;
        }

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
    Output.points[1][4] -= ad1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ad3 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    fb1 = lb0 && fb0;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    Output.points[1][5] += ad3;
    ad4 *= -1;
    fb1 = lb0 || fb0;
    fd0 *= -1;
    fb1 = fd1 < ad1;
    Thought lo1 = Thought38.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
    Output.points[1][6] += fd1;
    Thought lo2 = Thought357.getInstance();
if(ao4 != null){
      ao4.m2(lb0, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
    fb0 = fb1 || lb0;
    Output.points[1][7] += ad4;
    fb0 = fb1 || lb0;

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
    Output.points[1][8] += fd0;
    boolean lb0 = true;
    Output.points[2][0] += fd1;
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    if (lb0) {
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        fd1 *= -1;
}
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
    ab2 = ab3 && ab4;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought181.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;

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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
    Thought lo2 = Thought363.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought389.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    double ld4 = 467.3083329585971;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
        ld4 *= -1;
    Thought lo5 = Thought183.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, fb1, lb0, lb1, fb0);
if(fo0 != null){
      fd1 = fo0.m3(ld4, fd0, fd1, ld4, fb1, lb0, lb1, fb0);
}
    double ld6 = 762.4713983100069;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
        lb0 = lb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ld6, fd0, fd1, ld4);
}
    ld6 = fd0 + fd1;
    fb1 = lb0 || lb1;
    fb0 = ld4 > ld6;
    Thought lo7 = Thought7.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ld6);
    fb1 = !lb0;
    boolean lb8 = false;

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
    double ld0 = 883.3061203931798;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = ld0 > fd0;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought91.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    Output.points[2][1] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
    fb0 = fd1 < ld0;
    Output.points[2][2] += fd0;
    fb1 = lb2 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    fd1 = ld0 + fd0;
        fd1 *= -1;
    boolean lb3 = false;
    boolean lb4 = false;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    Thought lo0 = Thought253.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    double ld1 = 816.9569684712787;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
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
