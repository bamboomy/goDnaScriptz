package genetic;
import java.util.ArrayList;
class Thought61 extends Thought{
private static ArrayList<Thought61> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 988.1431343847729;
private double fd1 = 962.0112898981603;
private Thought fo0 = null;
private Thought fo1 = null;
Thought61 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought61 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought61 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought61 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought61 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought61 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought61 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought61 instance = new Thought61 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
        fb0 = !fb1;
        lb0 = fd1 > fd0;
        lb1 = fb0 && fb1;
        boolean lb2 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        double ld3 = 951.4029920710516;
        Thought lo4 = Thought126.getInstance(fd0, fd1, ld3, fd0);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
        lb2 = lb0 && lb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb2, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, lb1, fb0, fb1, lb2);
}
        Thought lo5 = Thought230.getInstance(fd0, fd1, ld3, fd0, lb0, lb1, fb0, fb1);
        lb2 = fd1 < ld3;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    double ld1 = 94.40872697376408;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        lb0 = ld1 > fd0;
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
    ad1 *= -1;
    Thought lo0 = Thought394.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    double ld2 = 290.92477591383766;
    Thought lo3 = Thought66.getInstance(fo0, fo1, fo0, fo1);
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld2, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1);
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
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    lb0 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fb1 = lb0 && ab1;
    ab2 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
    boolean lb1 = true;
    fd0 = fd1 - ad1;
    double ld2 = 547.5781724734728;
    ab4 = !fb0;
    Output.points[8][2] -= ad1;
    boolean lb3 = true;
    double ld4 = 518.3627497903303;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ld2 = ld4 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld2 *= -1;

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
      fb0 = ao1.m2();
}
    double ld0 = 173.5368075911152;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fd0 = fd1 + ld0;
        fb1 = !fb0;
        Thought lo1 = Thought356.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
        fd1 = ld0 - fd0;
        Output.points[8][3] -= fd1;
if(ao1 != null){
          ld0 = ao1.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        } else if (fb1) {
        fd1 = ld0 - fd0;
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
    fb0 = ad1 < ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad4 = fd0 + fd1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought277.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fd0 < fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = true;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(lb2, lb3, lb4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb1, lb2, lb3);
}
    Thought lo5 = Thought344.getInstance(fd1, ad1, ad2, ad3, lb4, fb0, fb1, lb1);

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;
    double ld0 = 953.8116025913283;
    if (ab2) {
        ab3 = !ab4;
        fb0 = fb1 || ab1;
        boolean lb1 = false;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
        boolean lb2 = true;
        boolean lb3 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
        double ld4 = 1.9760939236357182;
        ld4 *= -1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m1(lb2, lb3, ab1, ab2);
}
        ab3 = !ab4;
        Thought lo5 = Thought327.getInstance(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld4, fb0, fb1, lb1, lb2);
        lb3 = ld0 < fd0;
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
    ab2 = ad1 > ad2;
    ab3 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought252.getInstance();
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    double ld1 = 816.2163694381645;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld1 - ad1;
    ab3 = ab4 || fb0;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought72.getInstance(ao3, ao4, fo0, fo1);

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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[8][4] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought323.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Output.points[8][5] += fd0;
    Thought lo1 = Thought307.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;

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
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    double ld1 = 541.0425828384977;
    Output.points[8][6] += ld1;
    fd0 = fd1 + ld1;
    boolean lb2 = false;
    lb0 = lb2 && ab1;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
    lb2 = fd1 > ld1;
    boolean lb4 = false;
    lb3 = fd0 < fd1;
    boolean lb5 = true;
    ld1 = fd0 + fd1;
    Thought lo6 = Thought309.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb4, lb5, ab1, ab2);
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, ad1, ad2);
}
        double ld2 = 66.30892128396928;
        Output.points[8][7] += ad2;
        lb0 = fb0 && fb1;
        double ld3 = 109.26537107472168;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        lb1 = lb0 || fb0;
if(fo0 != null){
          fb1 = fo0.m2();
}
        Output.points[8][8] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(lb1, lb0, fb0, fb1);
}
        ld2 = ld3 - ad1;
        boolean lb4 = false;
        lb1 = lb4 && lb0;
        ad2 *= -1;
        Thought lo5 = Thought239.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb4);
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
    Thought lo0 = Thought334.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
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
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    double ld0 = 12.877804661591064;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought150.getInstance(fo1, ao1, ao2, ao3);
    fb1 = ld0 < fd0;
    boolean lb2 = true;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    lb2 = fb0 || fb1;
    double ld3 = 431.0953619130291;
if(ao4 != null){
      ao4.m3(fd0, fd1, ld0, ld3);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld3);
}
if(ao4 != null){
      fb0 = ao4.m2();
}
    fd0 = fd1 + ld0;
    Thought lo4 = Thought150.getInstance(fb1, lb2, fb0, fb1);
    lb2 = ld3 < fd0;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ld3, fd0, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld3, fd0, fb0, fb1, lb2, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb2, fb0, fb1);
}
    fd1 = ld0 - ld3;
    Thought lo5 = Thought147.getInstance(ao1, ao2, ao3, ao4);

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
    Thought lo0 = Thought397.getInstance(ad1, ad2, ad3, ad4);
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
        boolean lb1 = false;
        lb1 = fb0 && fb1;
        double ld2 = 599.0955568397483;
        lb1 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
        ad4 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld2, ad1, fb0, fb1, lb1, fb0);
}
        for(int i1=0; i1<10; i1++){
            ad2 *= -1;
            double ld3 = 77.36143487232982;
            boolean lb4 = false;
            fb0 = ad2 > ad3;
            ad4 = fd0 + fd1;
if(fo0 != null){
              fo0.m2(fo1, ao1, ao2, ao3, fb1, lb4, lb1, fb0);
}
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
              ao4 = fo0.m4(ld3, ld2, ad1, ad2);
}
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
            ld3 *= -1;
if(fo1 != null){
              fo1.m3();
}
}}
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
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        double ld0 = 241.311052863274;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
if(ao4 != null){
              fd1 = ao4.m3();
}
            ab2 = !ab3;
if(fo1 != null){
              fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
            ld0 = fd0 - fd1;
            ab2 = !ab3;
            ab4 = fb0 && fb1;
            }
        ab1 = !ab2;
        ab3 = !ab4;
        fb0 = ld0 < fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
        Thought lo1 = Thought143.getInstance(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - ld0;
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
    Thought lo0 = Thought212.getInstance(ao2, ao3, ao4, fo0);
    Output.points[0][0] -= ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(ao2 != null){
          ao2.m3();
}
        fd0 *= -1;
        fd1 = ad1 - ad2;
        lb2 = lb1 && ab1;
        ab2 = ab3 || ab4;
        Thought lo3 = Thought354.getInstance(fb0, fb1, lb2, lb1);
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        ad1 *= -1;
if(ao2 != null){
          ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb1, lb2, lb1, ab1);
}
        ab2 = !ab3;
        ab4 = ad1 > ad2;
        Thought lo4 = Thought326.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb2, lb1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (fb1) {
        fd0 *= -1;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb2 = false;
        } else if (lb0) {
        Thought lo3 = Thought31.getInstance();
        boolean lb4 = false;
        fd1 *= -1;
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
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd1 = fd0 - fd1;
    if (ab1) {
        ab2 = ab3 || ab4;
        fb0 = fb1 || ab1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        double ld0 = 934.2327423448692;
        boolean lb1 = false;
        ab3 = ab4 && fb0;
        double ld2 = 287.6887950803994;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld2, fd0, fd1);
}
        fb1 = !lb1;
        Thought lo3 = Thought252.getInstance(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab1 = ld0 < ld2;
        Output.points[0][1] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0, fb1, lb1, ab1, ab2);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought132.getInstance(ad1, ad2, ad3, ad4);
    fd0 *= -1;
    lb0 = fd1 > ad1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    Output.points[0][2] -= ad1;
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3();
}
    ab1 = ad1 > ad2;
    double ld0 = 125.70749323783004;
    ab2 = ab3 && ab4;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = ab1 && ab2;
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld0;
    lb1 = ab1 && ab2;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought311.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought315.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
    double ld4 = 446.85713327526446;
    ab4 = fb0 || fb1;
    if (lb1) {
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    double ld0 = 386.0134013339317;
    fb0 = ld0 < fd0;
    boolean lb1 = false;

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
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 + ad3;
    Output.points[0][3] += ad4;
    fd0 *= -1;
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
    lb0 = ad4 < fd0;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
if(ao1 != null){
      lb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fb1 = !lb0;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
    if (lb1) {
        fb0 = ad3 < ad4;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, lb1, fb0);
}
        fb1 = fd0 < fd1;
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m3(ad1, ad2, ad3, ad4);
}
        lb1 = fd0 > fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m3();
}
    ab1 = fd0 > fd1;
if(ao3 != null){
      fd0 = ao3.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought233.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
    Output.points[0][4] += fd1;
    fb0 = fb1 && ab1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    double ld1 = 585.4230959506832;
    fd0 = fd1 - ld1;
    Output.points[0][5] -= fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
if(ao4 != null){
      ao4.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    double ld2 = 803.7490244083436;

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
    Output.points[0][6] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    lb0 = ab1 && ab2;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4);
}
    Output.points[0][7] -= fd0;
    fd1 *= -1;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    double ld2 = 72.44747590489736;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, ab1, ab2);
}
    Thought lo3 = Thought126.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);

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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    Output.points[0][8] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought394.getInstance(fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb1 = fd0 < fd1;
        fd0 = fd1 + fd0;
        if (fb0) {
if(fo0 != null){
              fo0.m3();
}
            fd1 = fd0 + fd1;
            fd0 *= -1;
            Thought lo1 = Thought237.getInstance(fb1, fb0, fb1, fb0);
            fb1 = fb0 || fb1;
            fb0 = fb1 || fb0;
            fb1 = !fb0;
            fd1 = fd0 + fd1;
            fd0 = fd1 - fd0;
            fd1 = fd0 + fd1;
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
            Output.points[1][0] += fd1;
            fb1 = fd0 > fd1;
if(fo0 != null){
              fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
            fd0 = fd1 + fd0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought57.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fb1 = lb0 && ab1;
    ab2 = fd0 < fd1;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought151.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    lb0 = fd1 < fd0;
    Thought lo3 = Thought360.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
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
        fb0 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought381.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Output.points[1][1] -= ad3;
    fb0 = ad4 > fd0;
    fd1 *= -1;
    if (fb1) {
        Output.points[1][2] += ad1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    double ld0 = 792.0269782460597;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, ad1, ad2, ad3);
}
    fb1 = !ab1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
        ab2 = ad1 > ad2;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          ad3 = fo1.m3(ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
        Output.points[1][3] -= ad1;
        fb1 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
        ab1 = ad2 > ad3;
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ab3 = !ab4;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        Output.points[1][4] += fd0;
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
    double ld0 = 871.8682771296073;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld1 = 2.4669741540138754;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ld1 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    double ld2 = 605.3509576329876;
    boolean lb3 = false;
    ld0 = ld1 + ld2;

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
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought277.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    double ld1 = 776.0105514010978;
    boolean lb2 = true;
    double ld3 = 570.2335495405302;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(lb2, fb0, fb1, lb2);
}
    ad3 = ad4 - fd0;
    Output.points[1][5] += fd1;
    ld1 = ld3 - ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        fd1 *= -1;
        Thought lo1 = Thought261.getInstance(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        boolean lb2 = true;
        double ld3 = 239.87412205232255;
        fd0 *= -1;
        lb2 = ab1 || ab2;
        Thought lo4 = Thought82.getInstance(fd1, ld3, fd0, fd1);
        boolean lb5 = true;
        ld3 = fd0 - fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Output.points[1][6] -= ad1;
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Output.points[1][7] += ad3;
    for(int i0=0; i0<10; i0++){
        double ld1 = 368.2300870449042;
        boolean lb2 = true;
if(ao1 != null){
          ad3 = ao1.m3();
}
        ab2 = !ab3;
if(ao3 != null){
          ao2 = ao3.m4(ab4, fb0, fb1, lb2);
}
        }
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    double ld3 = 486.8504794027089;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = ad2 < ad3;
if(ao3 != null){
          lb0 = ao3.m2(ad4, fd0, fd1, ld3);
}
    double ld4 = 992.4761358136886;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld4, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
        fb1 = fb0 || fb1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought70.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld3 = 409.99159964030065;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);
}
if(fo0 != null){
      fo0.m1();
}
    Thought lo4 = Thought172.getInstance(lb0, lb1, fb0, fb1);

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
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fd0 < fd1;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought330.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    Thought lo0 = Thought233.getInstance();
    fb1 = !fb0;
    Output.points[1][8] -= fd0;
    boolean lb1 = false;
    double ld2 = 14.017750821371154;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
}
    boolean lb3 = true;
    fd1 *= -1;
    Output.points[2][0] -= ld2;
    double ld4 = 725.8106331217715;
    lb1 = lb3 && fb0;
if(fo0 != null){
      fo0.m1(ld4, fd0, fd1, ld2, fb1, lb1, lb3, fb0);
}
    ld4 *= -1;
    double ld5 = 302.3956959500397;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb3, fb0, fb1);
}
    double ld6 = 119.3576159219711;
        ld5 *= -1;
    Output.points[2][1] += ld6;

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
