package genetic;
import java.util.ArrayList;
class Thought154 extends Thought{
private static ArrayList<Thought154> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 5.3315511138579135;
private double fd1 = 112.31296850628803;
private Thought fo0 = null;
private Thought fo1 = null;
Thought154 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought154 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought154 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought154 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought154 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought154 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought154 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought154 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought154 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought154 instance = new Thought154 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought154 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought154 instance = new Thought154 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought154 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought154 instance = new Thought154 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought154 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought154 instance = new Thought154 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought154 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought154 instance = new Thought154 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought154 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought154 instance = new Thought154 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought154 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought154 instance = new Thought154 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought154 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought154 instance = new Thought154 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    Output.points[4][5] += fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    double ld0 = 918.9083325876938;
    fb1 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 + fd1;
        ld0 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        double ld2 = 164.08148435307373;
        lb1 = ld0 < fd0;
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
    boolean lb0 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 && ab4;
    double ld1 = 169.38139171459247;
    ld1 *= -1;
    fb0 = !fb1;
        Output.points[4][6] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fd1 > ld1;
    fb0 = fb1 || lb0;

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
    fb1 = fb0 || fb1;
    Output.points[4][7] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Thought lo1 = Thought209.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    fb0 = fd0 > fd1;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    double ld2 = 789.287204534518;

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
    boolean lb0 = true;
    ad3 = ad4 - fd0;
    if (ab1) {
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        Thought lo1 = Thought1.getInstance(fd1, ad1, ad2, ad3);
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = ad2 < ad3;
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo0.m3(fb1, lb0, ab1, ab2);
}
        ad1 = ad2 - ad3;
        Thought lo2 = Thought59.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
        Thought lo3 = Thought153.getInstance(fo1, fo0, fo1, fo0);
        fd1 *= -1;
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb2 = false;
    Output.points[4][8] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[5][0] -= fd1;
    Thought lo3 = Thought167.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    lb0 = !lb1;
    double ld4 = 987.5830122520374;
    Thought lo5 = Thought188.getInstance();
if(ao2 != null){
      lb2 = ao2.m2(fb0, fb1, lb0, lb1);
}
    boolean lb6 = true;
    lb2 = !lb6;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, fd0, fd1, ld4, fb0, fb1, lb0, lb1);
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
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[5][1] += fd1;
    fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;
    fb1 = fd0 > fd1;
    fb0 = ad1 > ad2;
    ad3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb1 = ad1 < ad2;
    double ld0 = 453.3819441315049;

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
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb0 = true;
    ab3 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab4 = ao2.m2(fb0, fb1, lb0, ab1);
}
        fd0 = fd1 - fd0;
        }
    double ld1 = 568.4649205042762;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ld1;
    double ld3 = 105.66656999433127;
if(ao2 != null){
      fb1 = ao2.m2(ld3, fd0, fd1, ld1, lb0, lb2, ab1, ab2);
}
    Thought lo4 = Thought83.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
    ld3 *= -1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - ld1;
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld1, ld3);
}
    fd0 = fd1 - ld1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld1);
}
    ld3 = fd0 + fd1;
if(ao1 != null){
      ld1 = ao1.m3();
}
    boolean lb5 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb2, lb5, ab1, ab2);
}
    Thought lo6 = Thought243.getInstance(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
    lb0 = lb2 || lb5;

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
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought381.getInstance(ad3, ad4, fd0, fd1);
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    Thought lo1 = Thought279.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    Thought lo2 = Thought288.getInstance();
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
    ad3 *= -1;
    Output.points[5][2] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb3, ab1);
}
    ad3 = ad4 + fd0;
    ab2 = fd1 < ad1;
    ab3 = !ab4;
    fb0 = ad2 < ad3;
    boolean lb4 = true;
    boolean lb5 = true;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb3);
}
    ad3 = ad4 - fd0;
    Thought lo6 = Thought376.getInstance(ao2, ao3, ao4, fo0, lb4, lb5, ab1, ab2);
    Thought lo7 = Thought221.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3);
}
    boolean lb8 = true;
    ab2 = ad4 > fd0;
    double ld9 = 338.75294034179126;
    Thought lo10 = Thought241.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld9, ad1);

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
    Output.points[5][3] += fd0;
    fd1 *= -1;
    double ld0 = 725.0056376245632;
    ld0 = fd0 - fd1;
    double ld1 = 159.4657471942159;
    if (fb0) {
if(fo1 != null){
          fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = ld0 > ld1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab1 = fd1 > fd0;
    Thought lo0 = Thought202.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = false;
    ab1 = ab2 && ab3;
    double ld2 = 404.12640817659167;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    fb0 = fd0 > fd1;
    ld2 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[5][4] -= ld2;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, ab1, ab2);
}
    fd0 = fd1 - ld2;
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, ab4, fb0, fb1, lb1);
}
    boolean lb3 = false;
    lb3 = ab1 && ab2;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb3, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld2 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 || fb1;
    ad1 = ad2 + ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought142.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 528.1211397049311;
        fb1 = ld1 > ad1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
    fb0 = fd1 > ld1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought366.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    double ld2 = 466.9653158068835;
    fd0 = fd1 + ld2;
    ad1 = ad2 + ad3;
    fb1 = lb0 || ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld2);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 *= -1;
    ab3 = ab4 || fb0;
    fb1 = fd1 > ld2;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    double ld3 = 703.8108525828784;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ld3 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    boolean lb4 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][5] += fd0;
        fb1 = fd1 > fd0;
    double ld0 = 278.87682284855464;
    fd0 = fd1 - ld0;
    if (fb0) {
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought174.getInstance(fo1, ao1, ao2, ao3);
        boolean lb2 = true;
        lb2 = fd0 < fd1;
if(fo0 != null){
          ao4 = fo0.m4(ld0, fd0, fd1, ld0);
}
        fd0 *= -1;
        Thought lo3 = Thought278.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
        fb0 = !fb1;
if(ao4 != null){
          ld0 = ao4.m3();
}
        fd0 *= -1;
        fd1 = ld0 - fd0;
        lb2 = fd1 > ld0;
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, lb2, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought366.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 < ad3;
    fb0 = ad4 < fd0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
        fb1 = fb0 && fb1;
        Thought lo1 = Thought183.getInstance();
        ad4 = fd0 - fd1;
if(ao1 != null){
          ad1 = ao1.m3(fb0, fb1, fb0, fb1);
}
        Output.points[5][6] -= ad2;
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
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    double ld0 = 227.8049619652809;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought376.getInstance(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
                boolean lb2 = true;
    double ld3 = 608.2161935356867;

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ab1 = fo0.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      ab2 = fo0.m2();
}
    boolean lb1 = true;
    boolean lb2 = false;
    fd0 = fd1 - ad1;
    Thought lo3 = Thought15.getInstance(ab1, ab2, ab3, ab4);
    ad2 = ad3 - ad4;
    boolean lb4 = true;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    Thought lo5 = Thought304.getInstance(ad4, fd0, fd1, ad1, lb1, lb2, lb4, ab1);
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
    Thought lo6 = Thought376.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      fb1 = ao3.m2(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    boolean lb7 = false;
if(ao3 != null){
      lb0 = ao3.m2();
}
    lb1 = lb2 && lb4;
if(ao4 != null){
      lb7 = ao4.m2(ab1, ab2, ab3, ab4);
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
    fd0 *= -1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    Output.points[5][7] -= fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought279.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    Output.points[5][8] += fd1;
    double ld3 = 744.0810493081837;

Thought.STACK_COUNTER++;
return ld3;
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
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    fd1 *= -1;
    if (ab3) {
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        fd0 *= -1;
        ab4 = fb0 && fb1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought100.getInstance();
        lb0 = !ab1;
        ab2 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
        lb0 = fd0 < fd1;
        Output.points[6][0] -= fd0;
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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Output.points[6][1] -= ad1;
    double ld0 = 571.1331707468045;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    Output.points[6][2] -= ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 = ld0 - ad1;
    ad2 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    lb1 = lb2 || fb0;
    ld0 = ad1 - ad2;
    ad3 *= -1;
    fb1 = lb1 && lb2;
    ad4 = fd0 - fd1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    lb2 = !fb0;

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
        ab2 = ab3 && ab4;
    Thought lo0 = Thought76.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    ab1 = ab2 || ab3;
    Output.points[6][3] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
    ab1 = ad4 < fd0;
    double ld2 = 674.6423715855618;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ld2 *= -1;
    Thought lo3 = Thought238.getInstance(fo1, fo0, fo1, fo0);
    lb1 = ad1 < ad2;
    ab1 = ad3 > ad4;
    ab2 = ab3 && ab4;
    double ld4 = 246.64976377970208;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ld4);
}
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    Thought lo5 = Thought303.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, ld4, ad1);
    ad2 = ad3 - ad4;
    Output.points[6][4] -= fd0;
    Thought lo6 = Thought49.getInstance();
    fb1 = !lb1;
    Thought lo7 = Thought311.getInstance(ab1, ab2, ab3, ab4);

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
    boolean lb0 = true;
    Thought lo1 = Thought94.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    Thought lo2 = Thought280.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb0 = !lb3;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 123.99837208494661;
    fb0 = ld0 < ad1;
    fb1 = fb0 && fb1;
    ad2 *= -1;
    Output.points[6][5] += ad3;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    if (fb0) {
        fb1 = ad2 < ad3;
        Thought lo1 = Thought263.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        ad4 = fd0 - fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought225.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        fd0 *= -1;
        ab2 = ab3 || ab4;
        fb0 = fb1 && ab1;
        Thought lo1 = Thought241.getInstance(fo1, ao1, ao2, ao3);
        ab2 = ab3 || ab4;
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
        fb0 = !fb1;
        ab1 = ab2 || ab3;
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
    ad1 = ad2 - ad3;
    double ld0 = 734.4731866118416;
    Thought lo1 = Thought262.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    ab2 = ab3 || ab4;
    fb0 = ld0 < ad1;
    fb1 = ab1 && ab2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad2 *= -1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao2.m2(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m2(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb0 = fd1 < ld0;

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
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    fd0 *= -1;
    double ld1 = 846.7839506708696;
    Thought lo2 = Thought277.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
    lb0 = fb0 && fb1;
    Thought lo3 = Thought399.getInstance();
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[6][6] -= ld1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = ld1 > fd0;
    for(int i0=0; i0<10; i0++){
        Output.points[6][7] -= fd1;
        if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
            fd0 *= -1;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Output.points[6][8] += fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    Output.points[7][0] += fd0;
    fd1 = fd0 + fd1;
    ab1 = fd0 < fd1;
    boolean lb2 = true;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    boolean lb3 = false;
    lb0 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    Output.points[7][1] -= ad2;
    fb1 = ad3 > ad4;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(lb1, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    Thought lo2 = Thought169.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
    if (fb0) {
        if (fb1) {
            boolean lb3 = false;
            double ld4 = 779.2384262746488;
            lb3 = !lb0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb3);
}
            ad2 *= -1;
            Output.points[7][2] -= ad3;
            lb0 = ad4 > fd0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, lb0, ab1);
}
    double ld1 = 939.6266683793021;
    Thought lo2 = Thought100.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ad1, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 && lb0;

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
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought391.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = !fb1;
        fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb1 = ad1 > ad2;
    Output.points[7][3] -= ad3;
    fb0 = fb1 || fb0;
    fb1 = ad4 > fd0;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    fb1 = !fb0;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    fb0 = fb1 && fb0;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;

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
    fd0 *= -1;
    Output.points[7][4] += fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      ab3 = ao1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    double ld0 = 114.14040171463313;
    ab2 = fd0 < fd1;
    ab3 = ld0 < fd0;
    ab4 = fb0 && fb1;
    double ld1 = 76.39151273603063;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought249.getInstance(fd1, ld0, ld1, fd0);
    ab1 = fd1 > ld0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
    boolean lb3 = false;
    ld1 *= -1;
    ab3 = fd0 > fd1;
    boolean lb4 = true;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    ab1 = ad3 < ad4;
    ab2 = ab3 || ab4;
    fd0 = fd1 + ad1;
    fb0 = ad2 > ad3;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought11.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
    boolean lb1 = false;
    fb0 = fb1 && lb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
        ad2 = ad3 + ad4;
        fb1 = fd0 < fd1;
        lb1 = !ab1;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 > ad1;
        ad2 = ad3 + ad4;
        lb1 = ab1 || ab2;
        fd0 *= -1;
if(fo1 != null){
          fo1.m3(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        Thought lo2 = Thought283.getInstance(ad4, fd0, fd1, ad1);
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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[7][5] += fd1;
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb1 = true;
    Thought lo2 = Thought380.getInstance(lb0, lb1, fb0, fb1);
    Thought lo3 = Thought155.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
    boolean lb4 = true;
    fd1 *= -1;
    Output.points[7][6] -= fd0;
    boolean lb5 = true;
    lb0 = !lb1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, lb4, lb5, fb0, fb1);
}
    Thought lo6 = Thought316.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, lb4, lb5);
    fb0 = fd1 > fd0;
    fb1 = !lb0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    double ld7 = 72.51947710318393;
    lb4 = lb5 && fb0;
    ld7 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld7, fd0, fd1, ld7);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, lb4);
}
    lb5 = fd0 > fd1;
    fb0 = fb1 && lb0;
    ld7 *= -1;

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
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    double ld0 = 388.89905571286505;
    fb1 = ld0 < fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fd1 > ld0;
    double ld1 = 694.9812743424136;
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
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
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought363.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
        fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    double ld2 = 754.3978172669948;
    boolean lb3 = true;
    lb3 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    boolean lb4 = true;
    fd1 = ld2 + fd0;
        Thought lo5 = Thought249.getInstance(fb0, fb1, lb1, lb3);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, lb4, fb0, fb1, lb1);
}
    boolean lb6 = false;
    Thought lo7 = Thought163.getInstance(ld2, fd0, fd1, ld2, lb3, lb4, lb6, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb3, lb4);
}
    lb6 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo8 = Thought185.getInstance(ld2, fd0, fd1, ld2);

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
