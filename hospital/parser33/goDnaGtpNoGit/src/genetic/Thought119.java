package genetic;
import java.util.ArrayList;
class Thought119 extends Thought{
private static ArrayList<Thought119> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 888.007501315973;
private double fd1 = 167.27200765477974;
private Thought fo0 = null;
private Thought fo1 = null;
Thought119 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought119 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought119 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought119 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought119 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought119 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought119 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought119 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought119 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought119 instance = new Thought119 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought119 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought119 instance = new Thought119 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought119 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought119 instance = new Thought119 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought119 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought119 instance = new Thought119 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought119 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought119 instance = new Thought119 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought119 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought119 instance = new Thought119 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought119 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought119 instance = new Thought119 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought119 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought119 instance = new Thought119 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought107.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    Thought lo1 = Thought320.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 - fd1;
    boolean lb2 = true;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    ab1 = !ab2;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab3 = fd0 < fd1;
    boolean lb0 = false;
    Thought lo1 = Thought31.getInstance(fd0, fd1, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
        Thought lo2 = Thought48.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
    fb0 = fb1 && fb0;
if(fo0 != null){
      ad1 = fo0.m3();
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought27.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m2();
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
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[7][1] += ad3;
    fb1 = ab1 || ab2;
    Thought lo0 = Thought98.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought121.getInstance(fb0, fb1, ab1, ab2);
    double ld2 = 31.443531758337752;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, ab4, fb0, fb1, ab1);
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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    Output.points[7][2] -= fd0;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      lb0 = ao2.m2();
}
    Output.points[7][3] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought311.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    lb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo4 = Thought124.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    double ld5 = 10.050384240833468;
    if (lb2) {
        Output.points[7][4] += ld5;
        lb3 = fd0 > fd1;
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
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    double ld1 = 374.39144071933197;
    boolean lb2 = true;
    lb2 = !fb0;
    ad3 = ad4 + fd0;
    fb1 = !lb0;
if(ao2 != null){
      ao2.m3();
}
    lb2 = !fb0;
    Thought lo3 = Thought313.getInstance(fb1, lb0, lb2, fb0);
        Thought lo4 = Thought103.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2, fb1, lb0, lb2, fb0);
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(ld1, ad1, ad2, ad3, lb0, lb2, fb0, fb1);
}
    boolean lb5 = true;
    lb0 = lb2 && lb5;
    fb0 = ad4 > fd0;
    fd1 = ld1 - ad1;
    Thought lo6 = Thought234.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, lb2, lb5);
    boolean lb7 = true;
    lb7 = !fb0;
    ad2 = ad3 + ad4;

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
    fd1 = fd0 - fd1;
    double ld0 = 437.22067497321035;
    ab2 = ld0 < fd0;
    fd1 *= -1;
    ld0 = fd0 - fd1;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld0 = ao2.m3(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    ab2 = ld0 > fd0;
    boolean lb2 = false;
    fd1 = ld0 + fd0;
    fd1 *= -1;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    ab2 = ab3 && ab4;
    ld0 *= -1;
    fb0 = fd0 < fd1;
    ld0 = fd0 + fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 223.10435795075264;
if(ao4 != null){
          ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
        Thought lo1 = Thought377.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    ab4 = ad1 < ad2;
    Thought lo2 = Thought273.getInstance(ao4, fo0, fo1, ao1);
    Thought lo3 = Thought351.getInstance(ad3, ad4, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
    ab4 = fb0 && fb1;
    ab1 = ld0 > ad1;
    Output.points[7][5] -= ad2;
    Thought lo4 = Thought387.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao4 != null){
      ao3 = ao4.m4(ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
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
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    double ld0 = 493.71695082771873;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 > ld0;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 452.5965347763876;
    ld0 = ld1 + fd0;
    fd1 = ld0 + ld1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo2 = Thought329.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fb0 = fo0.m2(ld1, fd0, fd1, ld0);
}
    fb1 = ld1 > fd0;
    if (fb0) {
        boolean lb3 = true;
        fd1 = ld0 + ld1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought140.getInstance();
if(fo0 != null){
      lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
        Output.points[7][6] += fd0;
    Output.points[7][7] -= fd1;
    Output.points[7][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
        Thought lo0 = Thought69.getInstance(fo1, fo0, fo1, fo0);
        boolean lb1 = false;
if(fo1 != null){
          fo1.m3(fd1, ad1, ad2, ad3);
}
        double ld2 = 741.9322666861942;
        ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
}
        Thought lo3 = Thought263.getInstance();
if(fo0 != null){
          lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
        fb1 = ad1 > ad2;
        lb1 = fb0 && fb1;
        boolean lb4 = true;
        ad3 *= -1;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, lb1, lb4, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(ad2, ad3, ad4, fd0, lb1, lb4, fb0, fb1);
}
        boolean lb5 = false;
        fd1 = ld2 + ad1;
        boolean lb6 = true;
        ad2 *= -1;
        lb1 = !lb4;
        ad3 = ad4 - fd0;
        boolean lb7 = true;
        lb5 = lb6 && lb7;
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
    ab1 = ab2 && ab3;
    double ld0 = 766.6731368122279;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2();
}
    fd0 *= -1;
    boolean lb3 = false;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb3, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, lb1, lb2, lb3, ab1);
}
    boolean lb4 = true;
    double ld5 = 873.7494275002092;
    ab1 = ad3 < ad4;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(ld5, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo6 = Thought224.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, lb2, lb3);
    double ld7 = 630.8172471282751;
    double ld8 = 364.1610694131662;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    lb4 = fd0 < fd1;
    boolean lb9 = true;

Thought.STACK_COUNTER++;
return lb9;
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
          fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Output.points[8][0] += fd0;
    double ld0 = 269.0201272071867;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[8][1] -= fd0;
    fb0 = !fb1;
    fd1 = ld0 - fd0;
    if (fb0) {
        double ld1 = 490.9317288399843;
        if (fb1) {
            fd0 = fd1 + ld1;
            fb0 = ld0 < fd0;
            boolean lb2 = true;
            double ld3 = 535.5754310198442;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld3, ld1, fb0, fb1, lb2, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m2(ad3, ad4, fd0, fd1);
}
        fb1 = !fb0;
        ad1 = ad2 + ad3;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
          ad2 = ao4.m3();
}
        ad3 = ad4 - fd0;
        fb1 = fd1 > ad1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        }
    Output.points[8][2] -= fd1;
    boolean lb0 = true;
    Thought lo1 = Thought305.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
    Thought lo2 = Thought166.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
    lb0 = fd0 < fd1;
    double ld3 = 642.2125181081755;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    Output.points[8][3] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
    boolean lb0 = false;
    ab2 = !ab3;
    Output.points[8][4] += fd0;
    Thought lo1 = Thought267.getInstance();
    fd1 = fd0 + fd1;
if(ao4 != null){
      ab4 = ao4.m2(fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought204.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        Output.points[8][5] += fd1;
if(ao3 != null){
          lb0 = ao3.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - fd0;
        fb0 = fb1 && lb0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        double ld3 = 796.032490154633;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
        ab1 = ab2 && ab3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ab4 = ao1.m2(ad3, ad4, fd0, fd1);
}
        boolean lb0 = true;
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        boolean lb1 = false;
if(ao2 != null){
          ao1 = ao2.m4();
}
        ab4 = fd0 > fd1;
        fb0 = fb1 || lb0;
        ad1 *= -1;
        lb1 = ad2 < ad3;
        ad4 = fd0 - fd1;
        ab1 = ad1 < ad2;
if(ao3 != null){
          ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
        lb0 = lb1 || ab1;
        for(int i1=0; i1<10; i1++){
            ab2 = ad3 > ad4;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought396.getInstance(fo1, fo0, fo1, fo0);
    lb0 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        lb0 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        lb0 = fd1 > fd0;
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
    fd0 = fd1 - fd0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought127.getInstance(ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;

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
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought235.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    Output.points[8][6] += ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb0 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
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
    if (ab2) {
        Thought lo0 = Thought154.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
        boolean lb1 = false;
        lb1 = fd0 < fd1;
        boolean lb2 = true;
        Output.points[8][7] -= ad1;
if(fo0 != null){
          lb2 = fo0.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb1;
        Output.points[8][8] -= fd1;
        ad1 = ad2 - ad3;
        boolean lb3 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(ao2 != null){
          ao2.m2();
}
    lb0 = !fb0;
    Output.points[0][0] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Output.points[0][1] -= fd0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = fd1 > ad1;
if(ao4 != null){
      ao4.m2(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    Output.points[0][2] += ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb0);
}
    fd1 = ad1 - ad2;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    if (lb1) {
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        Thought lo3 = Thought216.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
        lb2 = !fb0;
        fd0 *= -1;
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
        fb1 = fd1 < ad1;
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
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo0 = Thought277.getInstance(ab1, ab2, ab3, ab4);
    double ld1 = 935.2941957025143;
    fb0 = !fb1;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
    ab3 = !ab4;
    ld1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    double ld2 = 434.60256859194317;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo3 = Thought380.getInstance(ld1, ld2, fd0, fd1);
    ld1 = ld2 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, ld2, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 || ab3;
    ld1 = ld2 - fd0;

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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Output.points[0][3] -= ad2;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    fb1 = lb0 || lb1;
    fd0 = fd1 + fd0;
    double ld2 = 857.8291101271913;
    Thought lo3 = Thought298.getInstance(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fb0 = fd1 > ld2;
    fb1 = fd0 < fd1;
    boolean lb4 = false;
    Output.points[0][4] += ld2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld5 = 738.2057716135087;
    lb0 = ld5 > fd0;
    double ld6 = 91.54885648178104;
    boolean lb7 = false;
    lb1 = !lb4;

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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fb0 = !fb1;
    double ld1 = 592.0904032002811;
    Thought lo2 = Thought371.getInstance(fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
        for(int i1=0; i1<10; i1++){
            double ld3 = 319.1357186545602;
            ab3 = ab4 || fb0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            Thought lo4 = Thought305.getInstance(fd0, fd1, ld3, ld1);
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld1);
}
if(fo0 != null){
              fo1 = fo0.m4();
}
            Thought lo5 = Thought4.getInstance(fb1, lb0, ab1, ab2);
            boolean lb6 = true;
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, ld1, fd0, ab2, ab3, ab4, fb0);
}
            Thought lo7 = Thought291.getInstance(fd1, ld3, ld1, fd0, fb1, lb6, lb0, ab1);
            ab2 = fd1 > ld3;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
    double ld0 = 368.1313434960724;
    fb0 = !fb1;
    boolean lb1 = false;
    double ld2 = 607.8538223031175;
    Output.points[0][5] -= ad1;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
        boolean lb4 = false;
        ad2 = ad3 + ad4;
        lb3 = lb4 && lb1;
        fb0 = fb1 || lb3;
        double ld5 = 601.6110715608753;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld5);
}
if(fo0 != null){
          fo0.m2();
}
        Output.points[0][6] -= ld0;
        ld2 = ad1 + ad2;
        boolean lb6 = true;
        Thought lo7 = Thought326.getInstance(lb4, lb6, lb1, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb3, lb4, lb6);
}
        ld5 *= -1;
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
    for(int i0=0; i0<10; i0++){
        ab1 = ad2 < ad3;
        boolean lb0 = false;
if(fo0 != null){
          ab1 = fo0.m2(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 || ab1;
        ad2 *= -1;
        double ld1 = 252.67543596663066;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        Output.points[0][7] -= ad2;
        ad3 = ad4 + fd0;
        }
    double ld2 = 245.0700919887808;
    ld2 = ad1 + ad2;
    ab1 = ad3 < ad4;
    boolean lb3 = false;
    double ld4 = 158.86761790507478;
    ab1 = ad4 < fd0;
    Thought lo5 = Thought213.getInstance(fo1, fo0, fo1, fo0);
    ab2 = !ab3;
    fd1 *= -1;
    boolean lb6 = false;
    ld2 *= -1;

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
    double ld0 = 960.4021549256283;
    double ld1 = 966.727977708248;
if(ao1 != null){
      ld1 = ao1.m3(fd0, fd1, ld0, ld1);
}
    fd0 = fd1 - ld0;
    for(int i0=0; i0<10; i0++){
        fb0 = ld1 < fd0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          fd1 = ao3.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(ao3 != null){
          fb1 = ao3.m2(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = ld0 < ld1;
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
    boolean lb0 = false;
    fb0 = ad1 < ad2;
    double ld1 = 957.1881566933022;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    fb1 = ad2 < ad3;
        double ld2 = 522.5831492958638;
    Output.points[0][8] -= ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld1, ld2, ad1, ad2);
}
    lb0 = ad3 < ad4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld2);
}
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad1 = ao4.m3(fb0, fb1, lb0, lb3);
}
    fb0 = fb1 || lb0;
    Thought lo4 = Thought172.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb0);
    fd1 = ld1 - ld2;
    lb3 = !fb0;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld1, fb1, lb0, lb3, fb0);
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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought79.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought387.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought92.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        fd1 = fd0 - fd1;
        Thought lo3 = Thought245.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
        ab2 = fd0 < fd1;
        fd0 *= -1;
        boolean lb4 = false;
        boolean lb5 = true;
        fd1 *= -1;
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
    Thought lo0 = Thought16.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought374.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    Output.points[1][0] -= ad4;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fb1, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
    Output.points[1][1] -= ad4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
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
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1();
}
        fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Thought lo0 = Thought139.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld1 = 64.46233888953468;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    ld1 = fd0 + fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 790.5405507826606;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(ld0, fd0, fd1, ld0);
}
        fb1 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Output.points[1][2] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
    double ld2 = 749.8492018473861;
    ld0 = ld2 + fd0;
    fb1 = fd1 > ld0;
if(fo0 != null){
      fo0.m2(lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    lb1 = ld2 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    boolean lb3 = true;
    boolean lb4 = true;
    lb4 = ld0 > ld2;

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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Output.points[1][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    boolean lb1 = false;
    Output.points[1][4] += fd1;
if(fo0 != null){
      fo0.m3();
}
    lb0 = lb1 && fb0;
        fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    fd1 *= -1;
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
