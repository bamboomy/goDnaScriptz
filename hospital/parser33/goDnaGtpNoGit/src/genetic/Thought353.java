package genetic;
import java.util.ArrayList;
class Thought353 extends Thought{
private static ArrayList<Thought353> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 65.5218695574687;
private double fd1 = 178.65993819520006;
private Thought fo0 = null;
private Thought fo1 = null;
Thought353 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought353 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought353 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought353 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought353 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought353 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought353 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought353 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought353 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought353 instance = new Thought353 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought353 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought353 instance = new Thought353 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought353 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought353 instance = new Thought353 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought353 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought353 instance = new Thought353 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought353 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought353 instance = new Thought353 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought353 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought353 instance = new Thought353 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought353 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought353 instance = new Thought353 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought353 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought353 instance = new Thought353 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought255.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 206.6794452579224;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && lb0;
    ld2 *= -1;
    fb0 = fb1 || lb0;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
}
        lb0 = !fb0;
    fb1 = fd1 > ld2;

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
      fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    double ld0 = 671.3363478386635;
    ab1 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    if (ab2) {
if(fo1 != null){
          fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
        Output.points[1][7] -= ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
        Output.points[1][8] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 + fd0;
    if (fb0) {
        fb1 = !fb0;
        boolean lb0 = false;
        boolean lb1 = false;
        } else if (fb1) {
        fb0 = !fb1;
        Thought lo2 = Thought42.getInstance(fd1, ad1, ad2, ad3);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m1(fb0, fb1, fb0, fb1);
}
        Thought lo3 = Thought264.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        fd1 *= -1;
        Output.points[2][0] += ad1;
if(fo0 != null){
          fo0.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
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
    ad2 *= -1;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
        ab4 = ad1 > ad2;
        fb0 = ad3 < ad4;
if(fo1 != null){
          fo1.m2(fb1, lb0, ab1, ab2);
}
        ab3 = fd0 < fd1;
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
    boolean lb0 = true;
    fd0 *= -1;
    lb0 = fb0 || fb1;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought232.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    double ld2 = 445.9161619311996;
    ld2 = fd0 + fd1;
    fb0 = ld2 > fd0;
    fd1 = ld2 + fd0;
    fb1 = lb0 || fb0;
    boolean lb3 = false;
    boolean lb4 = false;
    Thought lo5 = Thought367.getInstance(fd1, ld2, fd0, fd1, lb4, fb0, fb1, lb0);
if(fo0 != null){
      ld2 = fo0.m3(fo1, ao1, ao2, ao3, lb3, lb4, fb0, fb1);
}
    lb0 = lb3 || lb4;
    boolean lb6 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo7 = Thought190.getInstance(fd0, fd1, ld2, fd0);
    boolean lb8 = true;
    double ld9 = 700.2082911878442;
    lb6 = lb8 && fb0;
    Thought lo10 = Thought326.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ld9);

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
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao2.m3();
}
        Output.points[2][1] -= ad3;
if(ao3 != null){
      ad4 = ao3.m3(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    fb1 = ad3 < ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = ab2 || ab3;
    Output.points[2][2] -= fd1;
    ab4 = fd0 > fd1;
    Thought lo0 = Thought372.getInstance(fd0, fd1, fd0, fd1);
        Output.points[2][3] -= fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m3();
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = !fb1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[2][4] += fd0;
    if (ab1) {
        ab2 = ab3 || ab4;
        Output.points[2][5] -= fd1;
        fb0 = fd0 < fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
        boolean lb1 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb2 = true;
        ab2 = ab3 || ab4;
        Thought lo3 = Thought374.getInstance(fd1, fd0, fd1, fd0);
        Thought lo4 = Thought94.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
        fb0 = fb1 && lb1;
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
    ab2 = ab3 || ab4;
    fb0 = ad2 < ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought307.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao2.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    double ld2 = 907.749871618975;
if(ao3 != null){
      ao3.m1();
}
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb1);
}
    ab1 = ab2 && ab3;
    ld2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
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
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    Thought lo0 = Thought349.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    Output.points[2][6] -= fd1;
    boolean lb2 = true;
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb2 = fd0 > fd1;
    Output.points[2][7] -= fd0;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab3 = fo1.m2();
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
        Thought lo1 = Thought168.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = lb2 && ab1;
    if (ab2) {
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        lb2 = fd0 < fd1;
        boolean lb3 = true;
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3();
}
        Thought lo4 = Thought218.getInstance(lb2, ab1, ab2, ab3);
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb3);
}
        lb0 = !lb2;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb0);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        fb0 = ad1 > ad2;
        ad3 = ad4 + fd0;
        boolean lb0 = true;
        fb0 = fd1 > ad1;
        boolean lb1 = true;
        double ld2 = 908.8766883078147;
        Thought lo3 = Thought268.getInstance(fo0, fo1, fo0, fo1);
        ad1 = ad2 - ad3;
        boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld2);
}
        double ld5 = 628.7330331471483;
        Output.points[2][8] -= ld5;
        ad1 *= -1;
        ad2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
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
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    double ld0 = 402.0638700493876;
    ld0 = ad1 + ad2;
    Thought lo1 = Thought293.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    Output.points[3][0] -= ld0;
    Thought lo2 = Thought143.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    Thought lo3 = Thought23.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    fd0 = fd1 - ld0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][1] += fd1;
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    Output.points[3][2] += fd1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
    Thought lo1 = Thought314.getInstance(ao2, ao3, ao4, fo0);
    double ld2 = 231.39827053008992;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    double ld3 = 803.1671152399049;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      ld2 = ao1.m3(fb0, fb1, lb0, fb0);
}
    boolean lb4 = true;
if(ao2 != null){
      ld3 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb4);
}
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ld2, ld3, fb1, lb0, lb4, fb0);
}
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, lb4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    fd0 *= -1;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        ab4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 *= -1;
    double ld0 = 246.86861840953222;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
    boolean lb2 = false;
    double ld3 = 753.7176634006289;
if(ao2 != null){
      ao1 = ao2.m4(ld3, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
}
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb4 = false;
    Output.points[3][3] -= ld3;
    lb4 = ab1 || ab2;
if(ao2 != null){
      ao2.m2(fd0, fd1, ld0, ld3);
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
    ab1 = ad1 < ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[3][4] -= ad2;
    double ld0 = 783.0125413977644;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab2 = !ab3;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = ad3 < ad4;
    ab2 = !ab3;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        } else {
        ad3 = ad4 - fd0;
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ao2.m3(ao3, ao4, fo0, fo1);
}
            ab2 = !ab3;
            ab4 = fd1 < ld0;
            fb0 = ad1 > ad2;
            boolean lb1 = true;
if(ao1 != null){
              fb0 = ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
            fb1 = ad4 > fd0;
            lb1 = ab1 && ab2;
if(ao2 != null){
              fd1 = ao2.m3();
}
}}
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
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 && fb0;
    fb1 = lb0 && lb1;
    Thought lo3 = Thought146.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb2 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
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
    Thought lo0 = Thought346.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
    ab1 = !ab2;
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
    boolean lb2 = false;
    ab2 = fd1 < fd0;
    boolean lb3 = true;
    Output.points[3][5] += fd1;
    ab2 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb1;
    lb2 = !lb3;
    boolean lb4 = true;
    lb4 = !ab1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    ad1 *= -1;
    boolean lb2 = true;
    fb0 = fb1 && lb0;
    ad2 = ad3 - ad4;
    boolean lb3 = true;
if(fo1 != null){
      fd0 = fo1.m3(lb1, lb2, lb3, fb0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 + ad2;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, lb1, lb2, lb3);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[3][6] += fd0;
if(fo0 != null){
      fo0.m1();
}
    double ld0 = 486.13118311951945;
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought54.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || ab1;

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
    fb1 = !fb0;
    fb1 = fd1 > fd0;
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    boolean lb0 = true;
    fd1 *= -1;
    lb0 = fb0 && fb1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    Thought lo1 = Thought24.getInstance();
if(ao2 != null){
      lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
    double ld2 = 95.31101700167049;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
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
    ad1 *= -1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought39.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = !fb1;
    fd0 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        ad4 = fd0 - fd1;
    if (fb0) {
        Output.points[3][7] += ad1;
        ad2 *= -1;
if(ao4 != null){
          ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ad2 = ao3.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = ad1 > ad2;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
}
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
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = fd0 < fd1;
    Output.points[3][8] += fd0;
    Thought lo0 = Thought247.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
          ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought336.getInstance();
    ab4 = fb0 || fb1;
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    boolean lb2 = true;
    fd1 *= -1;
    ab4 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(lb2, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb2, ab1);
}
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    ab4 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    double ld1 = 474.0735708194252;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb2 = true;
    fb0 = !fb1;

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
    fb0 = !fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    if (fb0) {
        Thought lo0 = Thought199.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
        fb1 = fb0 || fb1;
        fb0 = !fb1;
        Output.points[4][0] -= fd0;
        double ld1 = 530.2602723628795;
        Thought lo2 = Thought379.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[4][1] += fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ab4 = fo0.m2();
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
        boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 || fb0;
if(fo1 != null){
          fb1 = fo1.m2(lb0, lb1, ab1, ab2);
}
        Output.points[4][2] += fd0;
        ab3 = !ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
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
    fb0 = fb1 && fb0;
    Output.points[4][3] += ad2;
        Output.points[4][4] += ad3;
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[4][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      ad3 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
        fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 737.1181592334323;
    boolean lb1 = true;
    boolean lb2 = true;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    ld0 = ad1 - ad2;
    lb2 = ad3 < ad4;

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
    Output.points[4][6] -= ad2;
    Thought lo0 = Thought356.getInstance(fo1, fo0, fo1, fo0);
    ad3 = ad4 - fd0;
if(fo1 != null){
      ab4 = fo1.m2(fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = !ab1;
    ad4 = fd0 - fd1;
    Output.points[4][7] += ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < ad1;
    Thought lo1 = Thought318.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    fd1 *= -1;
    boolean lb2 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    Thought lo3 = Thought89.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    ad1 = ad2 + ad3;
    if (fb1) {
        double ld4 = 432.344951280836;
        ad3 *= -1;
        ad4 = fd0 + fd1;
        lb2 = ld4 > ad1;
        boolean lb5 = false;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld6 = 291.0985574823865;
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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought84.getInstance();
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
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
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad4 *= -1;
    fd0 *= -1;
    fb1 = fd1 > ad1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ad4 = ao1.m3();
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = fd1 > fd0;
    double ld0 = 717.9172143480245;
    double ld1 = 289.8479669808268;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ld1 = ao3.m3(fd0, fd1, ld0, ld1);
}
        ab1 = fd0 > fd1;
        boolean lb2 = true;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, fd0, fd1);
}
        ab1 = ld0 < ld1;
        Thought lo3 = Thought392.getInstance();
if(ao4 != null){
          fd0 = ao4.m3(ab2, ab3, ab4, fb0);
}
        double ld4 = 122.22799511449249;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    double ld1 = 766.0054288929125;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    boolean lb2 = false;
    double ld3 = 168.72255380775067;
    Thought lo4 = Thought91.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    lb0 = lb2 && ab1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo5 = Thought22.getInstance(fd0, fd1, ld1, ld3);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo6 = Thought80.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    Output.points[4][8] -= fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, ld3, ad1, fb1, lb0, lb2, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = !lb2;
    boolean lb7 = false;
    boolean lb8 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb7, lb8, ab1, ab2);
}
    fd1 *= -1;
    double ld9 = 988.6035959083912;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld1, ld3, ld9, ad1);
}
    ab3 = ad2 < ad3;

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
    Output.points[5][0] += fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[5][1] += fd0;
    double ld0 = 386.75126283327523;
    Thought lo1 = Thought195.getInstance();
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought355.getInstance(ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought45.getInstance(fd0, fd1, ld0, fd0);
    fb0 = fd1 > ld0;
    fb1 = !lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    boolean lb5 = true;
    boolean lb6 = true;
    boolean lb7 = false;
    double ld8 = 245.58187635172018;
if(fo1 != null){
      lb5 = fo1.m2();
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
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought30.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought309.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought15.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !fb0;
        fb1 = fd0 > fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb4 = false;
    fd1 *= -1;
    double ld5 = 910.3070568963949;
    lb3 = ld5 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld5, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
    Output.points[5][2] += ld5;
    Output.points[5][3] += fd0;
    Thought lo6 = Thought275.getInstance(lb4, fb0, fb1, lb3);
    fd1 *= -1;
    lb4 = ld5 < fd0;
    fb0 = fb1 && lb3;

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
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought82.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    fd1 *= -1;
    Output.points[5][4] += fd0;
    double ld3 = 282.9477701907733;

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
