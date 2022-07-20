package genetic;
import java.util.ArrayList;
class Thought299 extends Thought{
private static ArrayList<Thought299> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 76.1637100701621;
private double fd1 = 830.4293575313028;
private Thought fo0 = null;
private Thought fo1 = null;
Thought299 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought299 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought299 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought299 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought299 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought299 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought299 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought299 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought299 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought299 instance = new Thought299 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought299 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought299 instance = new Thought299 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought299 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought299 instance = new Thought299 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought299 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought299 instance = new Thought299 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought299 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought299 instance = new Thought299 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought299 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought299 instance = new Thought299 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought299 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought299 instance = new Thought299 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought299 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought299 instance = new Thought299 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 905.4793992132958;
    ld0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought336.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
    ld0 = fd0 - fd1;
    Output.points[6][3] -= ld0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb2, fb0);
}
    Output.points[6][4] += fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    lb2 = fd0 < fd1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][5] -= fd0;
    Thought lo0 = Thought151.getInstance(fd1, fd0, fd1, fd0);
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fd1 > fd0;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
    fd1 = fd0 - fd1;
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    fb0 = !fb1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld0 = 614.0935382577389;
        ad2 = ad3 + ad4;
        fb1 = fd0 < fd1;
        Output.points[6][6] -= ld0;
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4);
}
        Thought lo1 = Thought393.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
        ad2 *= -1;
        Output.points[6][7] += ad3;
        boolean lb2 = true;
        ad4 *= -1;
        fd0 = fd1 - ld0;
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
    double ld0 = 252.94366909391567;
    ab1 = ad1 > ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 758.5470860767093;
    if (ab2) {
        ad3 *= -1;
        Thought lo2 = Thought365.getInstance(ab3, ab4, fb0, fb1);
        boolean lb3 = false;
        lb3 = !ab1;
        ad4 *= -1;
        boolean lb4 = false;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought58.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought218.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    lb2 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, lb2, lb3);
}
    fb0 = !fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    double ld0 = 369.0349255996635;
    fb0 = ad4 < fd0;
    fd1 = ld0 - ad1;

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
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - fd0;
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      lb0 = ao4.m2(ab1, ab2, ab3, ab4);
}
    double ld1 = 924.3985660298724;
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, fb0, fb1, lb0, ab1);
}
    fd1 = ld1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
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
    ad1 *= -1;
    double ld0 = 164.85771585564143;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    fb0 = fb1 && lb1;
    boolean lb2 = false;
    lb2 = ad1 < ad2;
    double ld3 = 249.48956922035887;
    ab1 = ab2 || ab3;
    ab4 = ad2 > ad3;
    ad4 = fd0 - fd1;
    boolean lb4 = false;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab4 = ao2.m2();
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought280.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        double ld1 = 862.4921466736884;
        fd0 = fd1 + ld1;
        Thought lo2 = Thought327.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
        boolean lb3 = false;
        lb3 = fb0 || fb1;
        fd1 = ld1 + fd0;
if(fo1 != null){
          lb3 = fo1.m2();
}
if(fo0 != null){
          fo0.m3(fb0, fb1, lb3, fb0);
}
        Thought lo4 = Thought283.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb3, fb0, fb1);
        lb3 = ld1 < fd0;
        boolean lb5 = true;
        if (lb5) {
            fb0 = !fb1;
if(fo1 != null){
              fo1.m3(fd1, ld1, fd0, fd1, lb3, lb5, fb0, fb1);
}
            if (lb3) {
if(fo0 != null){
                  lb5 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb3, lb5);
}
}}}
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
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    Output.points[6][8] -= fd0;
    boolean lb0 = true;
    double ld1 = 868.0689420042658;
    boolean lb2 = true;
    fd0 *= -1;
    Output.points[7][0] -= fd1;
    Thought lo3 = Thought83.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo4 = Thought88.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    ab4 = fb0 && fb1;
    lb0 = lb2 && lb5;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 && ab4;
    boolean lb6 = true;
    Thought lo7 = Thought74.getInstance(ab4, fb0, fb1, lb0);
    lb2 = lb5 && lb6;

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
    Output.points[7][1] -= ad2;
    Output.points[7][2] -= ad3;
    fb1 = !fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 *= -1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 - fd0;
if(fo1 != null){
          fo1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fd1 = ad1 + ad2;

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
    ad1 = ad2 - ad3;
    ad4 *= -1;
    Output.points[7][3] += fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = !ab4;
    fb0 = fb1 && lb0;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        ad1 = ad2 - ad3;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb3 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought393.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Output.points[7][4] += fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[7][5] -= fd0;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fb0 = fd1 < fd0;
    Thought lo2 = Thought350.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[7][6] -= fd1;
    double ld3 = 331.03638005763116;
    Thought lo4 = Thought258.getInstance(fb1, lb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3, lb1, fb0, fb1, lb1);
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
    ad2 = ad3 - ad4;
    double ld0 = 981.7303234953199;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
    ad1 = ad2 - ad3;
    Output.points[7][7] -= ad4;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought277.getInstance(ad1, ad2, ad3, ad4);
    boolean lb3 = true;
    lb1 = lb3 && fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    Output.points[7][8] -= ad2;
    Output.points[8][0] += ad3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(lb1, lb3, fb0, fb1);
}
    lb1 = fd1 > ld0;
    lb3 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought24.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb1, lb3, fb0, fb1);
        Output.points[8][1] -= fd0;
        lb1 = fd1 < ld0;
if(ao4 != null){
          ao3 = ao4.m4(ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb1);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;
    if (fb0) {
        double ld0 = 353.95334306498364;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
        ab4 = fd0 > fd1;
        } else if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fb1 = ao1.m2(fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought234.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
        fd0 = fd1 - fd0;
        Thought lo2 = Thought306.getInstance();
        fd1 = fd0 + fd1;
if(fo1 != null){
          ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
        fd0 *= -1;
        fb1 = ab1 || ab2;
        Output.points[8][2] -= fd1;
        boolean lb3 = false;
        fd0 = fd1 - fd0;
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
}
        fd0 = fd1 + fd0;
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb3, ab1);
}
        Thought lo4 = Thought384.getInstance(fo1, ao1, ao2, ao3);
        Output.points[8][3] += fd1;
        ab2 = fd0 < fd1;
        fd0 = fd1 + fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][4] -= ad2;
    ab1 = ad3 < ad4;
    fd0 *= -1;
    if (ab2) {
        Output.points[8][5] -= fd1;
        Thought lo0 = Thought72.getInstance(ad1, ad2, ad3, ad4);
        ab3 = fd0 > fd1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        ab4 = !fb0;
        fd0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd1 *= -1;
        Thought lo1 = Thought381.getInstance(fb1, ab1, ab2, ab3);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
        Thought lo2 = Thought244.getInstance(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
        boolean lb3 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb3, ab1);
}
        Thought lo4 = Thought250.getInstance(ao3, ao4, fo0, fo1);
        Thought lo5 = Thought259.getInstance(ad3, ad4, fd0, fd1);
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        boolean lb6 = true;
        Thought lo7 = Thought253.getInstance();
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo1.m3(ab1, ab2, ab3, ab4);
}
        boolean lb8 = true;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, ad1, ad2, lb6, lb8, ab1, ab2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought216.getInstance();
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        double ld1 = 454.57048882678487;
        ld1 *= -1;
        double ld2 = 812.7222352427693;
        ld2 *= -1;
if(fo0 != null){
          ab1 = fo0.m2(fd0, fd1, ld1, ld2, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ab1 = !ab2;
        fd1 *= -1;
        ab3 = !ab4;
        for(int i0=0; i0<10; i0++){
            Thought lo3 = Thought271.getInstance(ld1, ld2, fd0, fd1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 348.51393674208947;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    Output.points[8][6] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb2 = fb0 || fb1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m1();
}
    Thought lo0 = Thought397.getInstance(ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    Output.points[8][7] += ad2;
    ad3 = ad4 - fd0;
    fb1 = ab1 || ab2;
    Output.points[8][8] -= fd1;
    double ld1 = 403.9627825248465;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, ab1, ab2);
}
    ad4 = fd0 - fd1;
    ab3 = !ab4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought114.getInstance(ao2, ao3, ao4, fo0);
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought117.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[0][0] += fd1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    boolean lb3 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);
}
    fd0 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    Output.points[0][1] -= fd0;
    lb1 = fd1 < ad1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ad3 = ao3.m3();
}
    fb1 = !lb0;
if(ao4 != null){
      ao4.m1(lb1, fb0, fb1, lb0);
}
    Output.points[0][2] -= ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    ab4 = fb0 && fb1;
    lb0 = fd0 < fd1;
    ab1 = !ab2;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    lb0 = lb1 || ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought109.getInstance();
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
if(ao4 != null){
      ab3 = ao4.m2(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    if (ab4) {
        Output.points[0][3] -= fd0;
        boolean lb3 = false;
        ab4 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb3, lb0, lb1, ab1);
}
        ab2 = fd1 < fd0;
        fd1 = fd0 + fd1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
        Thought lo4 = Thought23.getInstance(fo1, ao1, ao2, ao3);
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
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought196.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    double ld1 = 842.5382732445748;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 *= -1;
if(ao3 != null){
      ad4 = ao3.m3(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    boolean lb2 = true;
    ab3 = fd0 > fd1;
    ld1 = ad1 - ad2;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld1, ab4, fb0, fb1, lb2);
}
    Output.points[0][4] -= ad1;
    Thought lo3 = Thought77.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
    Thought lo4 = Thought363.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0);
}
    double ld5 = 556.0727014137601;
    fd0 *= -1;

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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
        lb0 = fd1 < fd0;
        fb0 = fb1 || lb0;
        fb0 = fb1 || lb0;
        }
    fb0 = fb1 || lb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld1 = 800.0167021270161;
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    fd1 = ld1 - fd0;
    fb0 = fd1 > ld1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[0][5] -= fd1;
        double ld0 = 20.426362008470324;
    ld0 *= -1;
    fb0 = fb1 && ab1;
        ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        ab4 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
        double ld1 = 428.332808447473;
        ld1 *= -1;
        Thought lo2 = Thought356.getInstance(ld0, fd0, fd1, ld1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld1);
}
        ld0 = fd0 - fd1;
        ab1 = !ab2;
        Thought lo3 = Thought123.getInstance();
        ab3 = ld1 > ld0;
        ab4 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
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
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought159.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 *= -1;
    lb1 = ad2 > ad3;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
    ad2 = ad3 - ad4;
    boolean lb3 = true;
    double ld4 = 475.47822512757034;
    lb3 = fb0 || fb1;

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
    Output.points[0][6] += ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ab1 = ad4 < fd0;
    Thought lo1 = Thought120.getInstance(fd1, ad1, ad2, ad3);
    ab2 = ad4 < fd0;
    for(int i0=0; i0<10; i0++){
        ab3 = fd1 < ad1;
        Thought lo2 = Thought397.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab4 = !fb0;
        fb1 = !lb0;
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
    double ld0 = 673.056395549674;
        Thought lo1 = Thought207.getInstance(fb1, fb0, fb1, fb0);
    if (fb1) {
        Thought lo2 = Thought39.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
        boolean lb3 = false;
        fd1 = ld0 + fd0;
        boolean lb4 = true;
        fd1 *= -1;
if(fo0 != null){
          lb3 = fo0.m2(ld0, fd0, fd1, ld0, lb4, fb0, fb1, lb3);
}
        lb4 = !fb0;
        fb1 = lb3 && lb4;
        Thought lo5 = Thought280.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb3, lb4);
        fd0 *= -1;
        double ld6 = 546.2177427440686;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld6, ld0, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
if(ao2 != null){
      fd0 = ao2.m3();
}
    lb0 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    Thought lo1 = Thought211.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;

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
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || lb1;
    Thought lo2 = Thought164.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld3 = 919.8678560031925;
    ld3 = fd0 - fd1;
    double ld4 = 833.1136609220591;
    boolean lb5 = true;

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
if(ao2 != null){
      ad1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    if (fb1) {
        Output.points[0][7] -= ad1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
        Output.points[0][8] -= ad2;
        ab1 = ab2 || ab3;
        ad3 *= -1;
        ab4 = !fb0;
        boolean lb0 = true;
        boolean lb1 = false;
        ad4 = fd0 - fd1;
        ab4 = fb0 && fb1;
        Thought lo2 = Thought41.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb1, ab1, ab2);
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, ab1, ab2);
}
        ad3 = ad4 + fd0;
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
        Output.points[1][0] += ad4;
        Thought lo3 = Thought78.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
        ad3 *= -1;
        if (ab4) {
            double ld4 = 857.4278234182221;
            fb0 = ad3 > ad4;
if(ao3 != null){
              ao2 = ao3.m4();
}
}}
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
    boolean lb0 = true;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    double ld2 = 99.37930088802852;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = ld2 + fd0;
if(fo0 != null){
      fo0.m1(fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fb0 = ld2 < fd0;

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
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[1][1] -= fd0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    Thought lo1 = Thought112.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m2();
}
    lb0 = fd0 < fd1;
    fd0 *= -1;
    Thought lo2 = Thought20.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought166.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);

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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    double ld0 = 356.64223300693124;
    Thought lo1 = Thought332.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ld0 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd0 > fd1;
    double ld2 = 217.6356410445428;
    fb0 = !fb1;
    ld0 *= -1;
    fb0 = ld2 < fd0;
    boolean lb3 = false;
    fb0 = fd1 > ld0;
    fb1 = lb3 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb3, fb0, fb1);
}
    lb3 = fb0 || fb1;
    ld2 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, lb3, fb0, fb1, lb3);
}
    fb0 = fd0 < fd1;
    fb1 = !lb3;

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
