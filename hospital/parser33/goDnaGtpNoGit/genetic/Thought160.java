package genetic;
import java.util.ArrayList;
class Thought160 extends Thought{
private static ArrayList<Thought160> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 795.695903153809;
private double fd1 = 637.1742853670279;
private Thought fo0 = null;
private Thought fo1 = null;
Thought160 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought160 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought160 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought160 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought160 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought160 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought160 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought160 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought160 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought160 instance = new Thought160 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought160 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought160 instance = new Thought160 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought160 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought160 instance = new Thought160 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought160 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought160 instance = new Thought160 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought160 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought160 instance = new Thought160 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought160 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought160 instance = new Thought160 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought160 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought160 instance = new Thought160 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought160 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought160 instance = new Thought160 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    if (fb1) {
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld0 = 466.18761116438026;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        fb1 = ld0 < fd0;
        double ld1 = 199.56168578469374;
        fd0 = fd1 - ld0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        fb0 = ld1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld2 = 850.0819072253781;
        Output.points[7][0] += fd0;
        fd1 = ld0 + ld1;
        ld2 = fd0 - fd1;
        boolean lb3 = true;
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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fb1 || ab1;
    boolean lb0 = true;
    ab1 = fd1 > fd0;
    boolean lb1 = true;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    Output.points[7][1] -= fd1;
    Output.points[7][2] += fd0;
    Thought lo2 = Thought287.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought379.getInstance(lb0, lb1, lb3, ab1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
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
    Output.points[7][3] += ad1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld0 = 740.0191635800542;
    fb0 = fb1 || fb0;
    ld0 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;

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
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    ab4 = fd0 > fd1;
    boolean lb0 = true;
    Thought lo1 = Thought357.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 556.4114773818407;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld3);
}
    boolean lb4 = false;
    ab3 = ad1 < ad2;
    ab4 = fb0 || fb1;
    lb0 = !lb2;

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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = lb0 && fb0;
    fb1 = !lb0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 - fd1;
    fb1 = lb0 && fb0;

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
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    if (fb0) {
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fd1 = ad1 + ad2;
        ad3 = ad4 - fd0;
        Thought lo0 = Thought231.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo0.m1(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = ab1 && ab2;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought70.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    Thought lo1 = Thought89.getInstance();
    ab3 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    ab1 = ab2 && ab3;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = false;
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    Output.points[7][4] -= fd0;

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
    double ld0 = 560.5243378242667;
    ab2 = ab3 && ab4;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = false;
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        ad4 = fd0 + fd1;
        lb2 = lb1 || ab1;
        ld0 = ad1 + ad2;
        ab2 = ab3 || ab4;
if(ao3 != null){
          ao3.m2(fb0, fb1, lb2, lb1);
}
        ab1 = ad3 < ad4;
        fd0 = fd1 - ld0;
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = lb2 && lb1;
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
    if (fb0) {
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        boolean lb0 = true;
        Thought lo1 = Thought87.getInstance(fo1, fo0, fo1, fo0);
        fd1 = fd0 + fd1;
        fd0 *= -1;
        Output.points[7][5] -= fd1;
        lb0 = fb0 || fb1;
        boolean lb2 = false;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        boolean lb3 = true;
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
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    double ld0 = 195.64101262326372;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
        double ld1 = 325.76396573056644;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld1);
}
        fb1 = ab1 || ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld1);
}
        boolean lb2 = true;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = ld0 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb2, ab1, ab2);
}
        ab3 = ab4 && fb0;
        Thought lo3 = Thought83.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ld0, fd0, fb1, lb2, ab1, ab2);
        Thought lo4 = Thought389.getInstance(fd1, ld1, ld0, fd0, ab3, ab4, fb0, fb1);
        fd1 *= -1;
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
    Thought lo0 = Thought97.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought248.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought191.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb1, fb0, fb1);
}
    boolean lb4 = true;
    lb1 = fd1 < ad1;
    double ld5 = 291.214187543698;
    lb4 = ad1 < ad2;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb4, fb0, fb1, lb1);
}
if(fo1 != null){
      lb4 = fo1.m2(ld5, ad1, ad2, ad3, fb0, fb1, lb1, lb4);
}
    ad4 *= -1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought261.getInstance(ld5, ad1, ad2, ad3);
    fb1 = lb1 && lb4;
    Thought lo7 = Thought183.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld5);
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !lb1;

Thought.STACK_COUNTER++;
return lb4;
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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 > ad2;
        ad3 *= -1;
    Thought lo0 = Thought319.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought50.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    double ld2 = 859.8443464173768;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1);
}
    Output.points[7][6] -= ad2;
    ad3 *= -1;
    Thought lo3 = Thought51.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    boolean lb4 = false;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, ab3, ab4, fb0, fb1);
}
    Thought lo5 = Thought36.getInstance(ad2, ad3, ad4, fd0, lb4, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb4);
}
    fd1 *= -1;
    ab1 = ld2 < ad1;

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
    boolean lb0 = false;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought371.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = false;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb2, lb3, fb0);
}
    boolean lb4 = true;
    fb0 = fd1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, lb3, lb4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb5 = true;
    double ld6 = 475.8316166577983;
    fb0 = !fb1;
    lb0 = ld6 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld6, fd0, fd1, ld6);
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
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    Thought lo1 = Thought56.getInstance();
if(ao2 != null){
      ao2.m2(lb0, fb0, fb1, lb0);
}
    Output.points[7][7] += ad1;
    ad2 *= -1;
    fb0 = ad3 > ad4;
    fb1 = lb0 || fb0;
    Output.points[7][8] += fd0;
    fb1 = lb0 || fb0;
    double ld2 = 39.97488721842233;
    fb1 = lb0 && fb0;
    fd0 *= -1;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld2, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ld2, lb0, fb0, fb1, lb0);
}
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    ad2 *= -1;

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
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ab1 = fd1 > fd0;
if(fo1 != null){
      ab2 = fo1.m2(fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3();
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    double ld0 = 616.0145812649724;
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
    if (ab4) {
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ld0 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fb0 = fd0 > fd1;
        ld0 = fd0 - fd1;
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
    ab1 = !ab2;
    ab3 = ad1 < ad2;
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ab4 = ao2.m2(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought44.getInstance();
    Output.points[8][0] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
    if (ab4) {
        fd1 = ad1 + ad2;
        boolean lb1 = false;
        Thought lo2 = Thought305.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
        Thought lo3 = Thought388.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
        fb0 = fb1 || lb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        boolean lb4 = true;
        ab4 = fb0 && fb1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    double ld0 = 92.14858895146237;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    boolean lb1 = false;
    Thought lo2 = Thought389.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    fd0 *= -1;
    if (fb0) {
        double ld3 = 231.68737628220364;
        fd0 = fd1 - ld3;
        Output.points[8][1] -= ld0;
        boolean lb4 = true;
        fb0 = fb1 || lb4;
if(fo1 != null){
          fd0 = fo1.m3();
}
if(fo0 != null){
          lb1 = fo0.m2(fb0, fb1, lb4, lb1);
}
        fb0 = fb1 || lb4;
        double ld5 = 593.5369935072663;
        Output.points[8][2] -= fd0;
        lb1 = fb0 && fb1;
        boolean lb6 = true;
        lb4 = lb6 && lb1;
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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought207.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld1 = 622.8891831365796;
    fb1 = ab1 || ab2;
    Thought lo2 = Thought277.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    ld1 = fd0 - fd1;
    ab1 = ld1 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    boolean lb3 = true;
    boolean lb4 = true;
    Output.points[8][3] -= fd1;
    boolean lb5 = true;
    lb5 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1();
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    double ld0 = 512.4499088291296;
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought295.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
    fb1 = fb0 || fb1;
    Thought lo2 = Thought298.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
        fb1 = fb0 && fb1;
        Output.points[8][4] -= fd1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    double ld0 = 991.6161118304947;
    Output.points[8][5] -= ad3;
    ad4 = fd0 - fd1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld0 *= -1;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    double ld1 = 23.102146915276844;
    boolean lb2 = false;
    ld0 = ld1 + ad1;
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 < ad3;
        double ld3 = 846.3588830643065;
        fb1 = !lb2;
        double ld4 = 646.4472809244032;
        ab1 = ad2 < ad3;
        ab2 = ab3 || ab4;
        ad4 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld4);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = ld0 < ld1;
        fb1 = lb2 || ab1;
        ab2 = ad1 < ad2;
        ab3 = ad3 > ad4;
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
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought244.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = fd0 > fd1;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, lb3, fb0, fb1);
}
    double ld4 = 858.9944753579288;
    Thought lo5 = Thought204.getInstance(ao3, ao4, fo0, fo1);
    lb0 = ld4 > fd0;
    boolean lb6 = false;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ld4 = ao1.m3(fd0, fd1, ld4, fd0);
}
        Thought lo7 = Thought294.getInstance(ao2, ao3, ao4, fo0, fd1, ld4, fd0, fd1);
        double ld8 = 616.6088172586777;
if(ao1 != null){
          fo1 = ao1.m4();
}
        lb1 = lb3 || lb6;
        boolean lb9 = true;
if(ao3 != null){
          ao2 = ao3.m4(lb6, fb0, fb1, lb9);
}
        lb0 = lb1 || lb3;
        lb6 = ld8 < ld4;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld8, ld4, fb0, fb1, lb9, lb0);
}
        lb1 = !lb3;
        lb6 = fd0 < fd1;
        fb0 = fb1 || lb9;
}
Thought.STACK_COUNTER++;
return ld4;
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
    Thought lo0 = Thought333.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    double ld2 = 903.9797234958886;
    boolean lb3 = true;
if(ao3 != null){
      lb3 = ao3.m2();
}
    boolean lb4 = false;
if(ao4 != null){
      ao4.m3(lb4, fb0, fb1, lb1);
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
    Thought lo0 = Thought256.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        Thought lo1 = Thought268.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3);
}
        ab3 = ab4 && fb0;
        fb1 = !ab1;
        ab2 = ab3 || ab4;
        boolean lb2 = true;
        boolean lb3 = true;
        Thought lo4 = Thought87.getInstance(fd0, fd1, fd0, fd1);
        ab3 = ab4 || fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
        Thought lo5 = Thought31.getInstance();
        Output.points[8][6] -= fd0;
        fd1 = fd0 + fd1;
        fb1 = fd0 < fd1;
        lb2 = fd0 > fd1;
        Thought lo6 = Thought339.getInstance(lb3, ab1, ab2, ab3);
        ab4 = !fb0;
        boolean lb7 = false;
        fb0 = !fb1;
        boolean lb8 = false;
        lb2 = lb3 || lb7;
        fd0 = fd1 + fd0;
        lb8 = ab1 && ab2;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        fd0 = fd1 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb2, lb3, lb7, lb8);
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
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 && ab4;
    Output.points[8][7] -= ad1;
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    ab1 = fd1 > ad1;
    ab2 = ad2 > ad3;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought299.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb1 = fb0 || fb1;
    if (lb1) {
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = !fb1;
        lb1 = !fb0;
        boolean lb2 = false;
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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
    Output.points[8][8] -= fd1;
    boolean lb0 = true;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld1 = 580.7187835568415;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
        ld1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
          fo1.m1();
}
        double ld2 = 293.6326445968545;
        double ld3 = 215.4968262460722;
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ld3, ld1, fd0, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 && ab3;
        Thought lo4 = Thought391.getInstance(fd1, ld2, ld3, ld1, ab4, fb0, fb1, lb0);
        fd0 = fd1 - ld2;
        for(int i1=0; i1<10; i1++){
            ld3 = ld1 - fd0;
            boolean lb5 = false;
            fd1 *= -1;
            lb0 = ld2 < ld3;
            ab1 = ab2 || ab3;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought287.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
    fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    fd0 = fd1 - ad1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought130.getInstance(fo0, fo1, fo0, fo1);
    ad1 = ad2 - ad3;
    ad4 *= -1;
    lb1 = lb2 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    fb1 = lb1 && lb2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb4 = false;
if(fo1 != null){
      lb4 = fo1.m2();
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
    boolean lb0 = false;
    Output.points[0][0] -= ad1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb0 = ad2 > ad3;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    Thought lo1 = Thought179.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = fd1 > ad1;
    ab4 = fb0 || fb1;
    ad2 = ad3 + ad4;

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
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 *= -1;
    double ld0 = 694.0990635319032;
    fb1 = fb0 || fb1;
    if (fb0) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(ld0, fd0, fd1, ld0);
}
        fb0 = fd0 < fd1;
        fb1 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        fb1 = fb0 && fb1;
        double ld1 = 487.03369651551;
        Thought lo2 = Thought273.getInstance(fb0, fb1, fb0, fb1);
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
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Output.points[0][1] -= ad2;
    fb1 = fb0 && fb1;
    if (fb0) {
        fb1 = !fb0;
        Thought lo0 = Thought306.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        double ld1 = 711.8427535077428;
        double ld2 = 138.21097495019785;
        ad3 = ad4 - fd0;
        double ld3 = 993.8702191498289;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        fb0 = fd1 < ld1;
        Thought lo4 = Thought376.getInstance(ld2, ld3, ad1, ad2);
        fb1 = !fb0;
        } else {
        Thought lo5 = Thought326.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
if(ao4 != null){
          fb1 = ao4.m2();
}
        Output.points[0][2] -= ad4;
        fb0 = fd0 > fd1;
        ad1 *= -1;
if(fo0 != null){
          ad2 = fo0.m3(fb1, fb0, fb1, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][3] += fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    lb0 = lb1 && ab1;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    double ld3 = 210.01418064063003;
    Thought lo4 = Thought43.getInstance(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3);
    fd0 = fd1 + ld3;
    fd0 = fd1 + ld3;
    double ld5 = 227.67942634688015;
    ld5 *= -1;

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
    ab2 = ad1 > ad2;
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = ab1 && ab2;
    ad3 *= -1;
if(ao4 != null){
      ab3 = ao4.m2(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought158.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought218.getInstance(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
    boolean lb2 = false;
    Thought lo3 = Thought209.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
    Thought lo4 = Thought76.getInstance(ao1, ao2, ao3, ao4);
    fd1 *= -1;
    Output.points[0][4] += ad1;
    lb2 = ad2 < ad3;
    ad4 = fd0 - fd1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    double ld5 = 141.08816245796984;
    fb1 = ld5 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld5, ad1, ad2);
}
    lb2 = ab1 || ab2;
    ab3 = ad3 > ad4;
    boolean lb6 = false;

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
    Thought lo0 = Thought260.getInstance();
    fb0 = fd1 < fd0;
    Output.points[0][5] -= fd1;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought385.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);

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
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
    double ld3 = 87.74176944642167;
    lb2 = ld3 < fd0;

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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 655.78538918331;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    lb1 = fb0 || fb1;
    fd1 = ld0 + fd0;
    Thought lo2 = Thought151.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    double ld3 = 742.0207927077248;
if(fo0 != null){
      ld0 = fo0.m3();
}
    lb1 = ld3 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fd1 = ld0 - ld3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3, fb1, lb1, fb0, fb1);
}
    boolean lb4 = false;
    lb1 = fd0 < fd1;
    Output.points[0][6] += ld0;

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
