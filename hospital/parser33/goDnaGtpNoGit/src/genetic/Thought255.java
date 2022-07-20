package genetic;
import java.util.ArrayList;
class Thought255 extends Thought{
private static ArrayList<Thought255> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 113.10245477025308;
private double fd1 = 48.62959612698061;
private Thought fo0 = null;
private Thought fo1 = null;
Thought255 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought255 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought255 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought255 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought255 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought255 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought255 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought255 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought255 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought255 instance = new Thought255 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought255 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought255 instance = new Thought255 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought255 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought255 instance = new Thought255 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought255 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought255 instance = new Thought255 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought255 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought255 instance = new Thought255 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought255 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought255 instance = new Thought255 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought255 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought255 instance = new Thought255 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought255 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought255 instance = new Thought255 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    double ld0 = 996.769762322522;
    ld0 = fd0 - fd1;
    fb0 = ld0 > fd0;
    Thought lo1 = Thought174.getInstance(fd1, ld0, fd0, fd1);
    Output.points[3][2] -= ld0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    double ld2 = 522.6894298152738;
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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    Output.points[3][3] += fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !ab1;
    fd1 *= -1;
    boolean lb0 = false;
    Thought lo1 = Thought136.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    lb2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld3 = 205.20938205337194;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo1 != null){
      ld3 = fo1.m3(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 160.253477612718;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ld0, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought217.getInstance();
    double ld2 = 871.2081962380254;
    boolean lb3 = true;
    Thought lo4 = Thought351.getInstance(fb0, fb1, lb3, fb0);
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb3, fb0);
}
    boolean lb5 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb5);
}
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo6 = Thought223.getInstance(ld2, ad1, ad2, ad3);

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
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ab3 = ad1 < ad2;
    if (ab4) {
if(fo0 != null){
          fo0.m2();
}
        fb0 = fb1 || ab1;
        ab2 = ad3 < ad4;
        Thought lo0 = Thought181.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ad1 = ad2 + ad3;
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
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[3][4] += fd1;
    Output.points[3][5] += fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = fd1 > fd0;
    Thought lo0 = Thought215.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
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
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
    ad2 *= -1;
    fb1 = !fb0;
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    fb0 = fb1 && fb0;
    fd0 *= -1;
    fd1 *= -1;
    double ld0 = 94.80804737717256;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ab2 = ao2.m2();
}
    fd1 *= -1;
    boolean lb1 = false;
    ab2 = ab3 && ab4;
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
if(ao1 != null){
      ad2 = ao1.m3(ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
          ao1.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        boolean lb0 = true;
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
        ad2 *= -1;
if(ao3 != null){
          ao2 = ao3.m4();
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
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 *= -1;
    lb0 = fd1 < fd0;
    Output.points[3][6] -= fd1;
    Thought lo1 = Thought175.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb1 = fd0 < fd1;
    lb0 = !fb0;
    boolean lb2 = true;
        fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Thought lo0 = Thought155.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought97.getInstance(fd0, fd1, fd0, fd1);
        fd0 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
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
    fb1 = ad1 > ad2;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    ad3 = ad4 - fd0;
if(fo0 != null){
      lb2 = fo0.m2(fd1, ad1, ad2, ad3);
}
        double ld3 = 777.1521404207328;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2);
}
    Thought lo4 = Thought183.getInstance();
if(fo0 != null){
      ad3 = fo0.m3(fb1, lb0, lb1, lb2);
}
    Output.points[3][7] -= ad4;
    fb0 = fb1 && lb0;
    fd0 = fd1 - ld3;

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
    double ld0 = 353.3953849868983;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought135.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    boolean lb2 = true;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb2);
}
    fd1 = ld0 - ad1;
    boolean lb3 = false;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    Output.points[3][8] += fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld4 = 426.3652806416342;
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought257.getInstance(ld0, ld4, ad1, ad2);
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb6 = true;
        boolean lb7 = true;
        ld4 = ad1 + ad2;
        ab2 = ab3 && ab4;
        ad3 *= -1;
        fb0 = fb1 && lb6;
        ad4 *= -1;
        Output.points[4][0] += fd0;
        lb7 = lb2 || lb3;
        fd1 = ld0 + ld4;
        ab1 = !ab2;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb6, lb7, lb2, lb3);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][1] -= fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    double ld1 = 726.5687663203221;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
    double ld2 = 135.54541108856728;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = ad1 < ad2;
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(lb2, fb0, fb1, lb0);
}
    double ld3 = 706.5510810320379;
    lb1 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 + ld3;
    lb2 = ad1 < ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    lb2 = ld3 > ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld3, ad1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 && fb0;
    ad2 = ad3 + ad4;

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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    ab3 = ab4 || fb0;
    Thought lo0 = Thought171.getInstance(fb1, ab1, ab2, ab3);
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    double ld1 = 119.4706615795232;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld1 > fd0;
    Output.points[4][2] += fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
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
    Thought lo0 = Thought72.getInstance(ao1, ao2, ao3, ao4);
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    double ld2 = 708.4830102121575;
    ab4 = ld2 > ad1;
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
        Output.points[4][3] += fd0;
if(fo0 != null){
          fb0 = fo0.m2(fd1, ld2, ad1, ad2);
}
        ad3 *= -1;
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = fb0 && fb1;
    Thought lo1 = Thought223.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb0, fb0, fb1, lb0);
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
        ab2 = ab3 || ab4;
    Output.points[4][4] += fd1;
    Output.points[4][5] -= fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    double ld1 = 461.5882379155201;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ab4 = fb0 || fb1;
    Thought lo3 = Thought380.getInstance();

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought124.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
    fb1 = fd0 > fd1;
    Output.points[4][6] -= ad1;
    lb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ad2 < ad3;
if(fo1 != null){
          fo1.m2(ad4, fd0, fd1, ad1);
}
    double ld2 = 422.2803891904524;
        lb0 = !fb0;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought15.getInstance(fb0, fb1, lb0, lb3);
    fb0 = fd0 > fd1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, lb3, fb0);
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
    double ld0 = 771.4537726248407;
    double ld1 = 41.10721277673966;
    double ld2 = 291.8562080217482;
    ld0 = ld1 - ld2;
    Thought lo3 = Thought127.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    double ld4 = 351.3820151842835;
    fb1 = ad4 > fd0;
    boolean lb5 = true;
    fd1 *= -1;
    ld0 *= -1;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
    Thought lo0 = Thought343.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;

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
    Output.points[4][7] += ad1;
    ad2 *= -1;
    fb1 = ad3 > ad4;
    double ld0 = 306.60967304627013;
    if (fb0) {
        ad4 = fd0 - fd1;
if(ao2 != null){
          ld0 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
            boolean lb1 = true;
            double ld2 = 116.12165870694966;
            ad1 = ad2 + ad3;
            double ld3 = 654.501293964569;
if(ao3 != null){
              ad3 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
            ad4 = fd0 - fd1;
            fb1 = lb1 || fb0;
            fb1 = !lb1;
            boolean lb4 = false;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            ld2 *= -1;
            lb4 = fb0 && fb1;
            lb1 = !lb4;
            fb0 = fb1 && lb1;
if(ao3 != null){
              ao2 = ao3.m4(ld3, ld0, ad1, ad2);
}
if(ao4 != null){
              lb4 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
            Output.points[4][8] -= ld2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb0 = true;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    lb1 = fd0 > fd1;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought193.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo3 = Thought364.getInstance();
    ab1 = !ab2;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    Thought lo4 = Thought123.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    double ld5 = 35.69162068941693;
    lb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    Output.points[5][0] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ld5 *= -1;
    fd0 = fd1 + ld5;
    Thought lo6 = Thought76.getInstance(fd0, fd1, ld5, fd0);

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
    ab1 = !ab2;
if(ao1 != null){
      ad1 = ao1.m3(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 55.41057913267445;
    fb1 = ab1 || ab2;
    boolean lb1 = false;
    ab2 = !ab3;
    ab4 = fd0 < fd1;
if(ao1 != null){
      ao1.m2(ld0, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
}
    ab2 = ad4 < fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ld0 = ad1 + ad2;
    if (lb1) {
        ab1 = ad3 < ad4;
        boolean lb2 = true;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    Output.points[5][1] += fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        } else if (fb1) {
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
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
    fd1 = fd0 + fd1;
        ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    Output.points[5][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
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
    boolean lb0 = true;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[5][3] += ad2;
    double ld1 = 17.96907039565798;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    Output.points[5][4] += ad2;

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
    Thought lo0 = Thought217.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Output.points[5][5] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    double ld1 = 610.2308552663959;
    ad2 = ad3 + ad4;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
    boolean lb2 = false;
    ab2 = !ab3;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = lb2 && ab1;
    if (ab2) {
        ad2 = ad3 - ad4;
        fd0 = fd1 - ld1;
        ab3 = !ab4;
        double ld3 = 524.8894448648604;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    Output.points[5][6] -= fd1;
    lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought142.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, lb1, fb0, fb1);
}
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
    Thought lo3 = Thought127.getInstance(fd1, fd0, fd1, fd0);
    double ld4 = 966.1395485210087;
    Thought lo5 = Thought377.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld4, fd0);
    Thought lo6 = Thought212.getInstance();
if(ao4 != null){
      lb1 = ao4.m2(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    double ld7 = 513.7677584578648;
if(ao4 != null){
      ao4.m2(ld4, ld7, fd0, fd1, fb1, lb0, lb1, fb0);
}
    double ld8 = 216.7431131050348;
    if (fb1) {
        lb0 = lb1 && fb0;
        Output.points[5][7] -= ld4;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, lb1, fb0);
}
        double ld9 = 909.8404763937848;
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought99.getInstance(fb1, lb0, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    ad1 *= -1;
    fb1 = lb0 || fb0;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Output.points[5][8] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    lb1 = !ab1;
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    Output.points[6][0] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, lb2, ab1, ab2);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld3 = 549.4047992445213;
    Thought lo4 = Thought78.getInstance(fd0, fd1, ld3, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld3, fd0, fd1);
}
    ab4 = fb0 || fb1;
    lb0 = lb1 && lb2;
if(ao1 != null){
      ao1.m3();
}
    Output.points[6][1] -= ld3;

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
    Thought lo0 = Thought196.getInstance(ab2, ab3, ab4, fb0);
    boolean lb1 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
    double ld2 = 646.5267822044552;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, ad1, ab2, ab3, ab4, fb0);
}
        fb1 = !lb1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld2;
    boolean lb3 = true;

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
    fb1 = fb0 && fb1;
    double ld0 = 710.0920322180755;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    boolean lb2 = true;
    lb1 = lb2 || fb0;
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
    lb1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    double ld3 = 323.93019927178153;
    Thought lo4 = Thought82.getInstance(fo0, fo1, fo0, fo1);

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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought260.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    double ld1 = 329.3772426795361;
    Thought lo2 = Thought27.getInstance();
    double ld3 = 838.2794174446093;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ld1 = ld3 - fd0;
    fb1 = fb0 && fb1;
    boolean lb4 = false;
    lb4 = fd1 > ld1;
    ld3 *= -1;
    double ld5 = 808.526608382764;
        boolean lb6 = true;
if(fo0 != null){
      lb6 = fo0.m2(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld1, fb0, fb1, lb4, lb6);
}
if(fo1 != null){
      fo1.m3(ld3, ld5, fd0, fd1, fb0, fb1, lb4, lb6);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb4, lb6, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb4 = !lb6;
    fb0 = fb1 && lb4;
if(fo0 != null){
      lb6 = fo0.m2(ld1, ld3, ld5, fd0);
}
    fb0 = fb1 || lb4;

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
    fb1 = fb0 || fb1;
    Thought lo0 = Thought54.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Output.points[6][2] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + fd0;
    Output.points[6][3] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    double ld2 = 883.1277076000414;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
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
}
