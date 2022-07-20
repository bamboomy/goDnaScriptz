package genetic;
import java.util.ArrayList;
class Thought168 extends Thought{
private static ArrayList<Thought168> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 717.1075775122948;
private double fd1 = 828.731914904033;
private Thought fo0 = null;
private Thought fo1 = null;
Thought168 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought168 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought168 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought168 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought168 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought168 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought168 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought168 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought168 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought168 instance = new Thought168 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought168 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought168 instance = new Thought168 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought168 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought168 instance = new Thought168 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought168 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought168 instance = new Thought168 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought168 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought168 instance = new Thought168 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought168 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought168 instance = new Thought168 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought168 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought168 instance = new Thought168 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought168 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought168 instance = new Thought168 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
        if (fb1) {
        fb0 = fd1 < fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        double ld0 = 964.9183798004468;
        fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
        Thought lo1 = Thought26.getInstance();
if(fo0 != null){
          fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
        Thought lo2 = Thought262.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld0 = fd0 + fd1;
        fb0 = fb1 && fb0;
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
    fd0 = fd1 - fd0;
    Output.points[5][0] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
    Thought lo0 = Thought120.getInstance(fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought46.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    boolean lb2 = true;
    fb0 = fd1 > fd0;

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
    Thought lo0 = Thought256.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = ad2 > ad3;
    Thought lo1 = Thought395.getInstance(fo1, fo0, fo1, fo0);
    ad4 = fd0 - fd1;
    Thought lo2 = Thought131.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[5][1] -= ad3;
    fb1 = fb0 && fb1;
    fb0 = ad4 < fd0;
    fd1 *= -1;
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    double ld3 = 120.99571281891495;
    fb0 = fd0 < fd1;
    boolean lb4 = false;
    Thought lo5 = Thought12.getInstance(fb0, fb1, lb4, fb0);

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
    if (ab1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        boolean lb0 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb1 = false;
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
        boolean lb2 = false;
        lb1 = lb2 || ab1;
        ad2 = ad3 + ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld3 = 741.1602968580064;
if(fo1 != null){
          ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, lb2, ab1);
}
        boolean lb4 = false;
        ab1 = ab2 && ab3;
        Thought lo5 = Thought16.getInstance(ld3, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;

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
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 259.1161505017101;
        Output.points[5][2] += ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Output.points[5][3] -= ld0;
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    fd1 *= -1;
    ld0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(fd1, ld0, ad1, ad2);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought30.getInstance();
    ld0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      lb2 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
    fb0 = fb1 || lb1;

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
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab4 = fd1 < fd0;
    fb0 = fb1 || ab1;
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ab2 = ao1.m2();
}
if(ao2 != null){
      ao2.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
    Output.points[5][4] -= ad1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    ab1 = fd1 < ad1;
    Output.points[5][5] += ad2;
    ad3 *= -1;
    ab2 = ad4 < fd0;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab4 = fb0 && fb1;
    ab1 = !ab2;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    Output.points[5][6] += ad2;
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
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
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = fd0 > fd1;
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld3 = 234.97788168506625;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);
}
    boolean lb4 = false;
    Output.points[5][7] += fd0;
    lb2 = fd1 > ld3;
    lb4 = fb0 || fb1;

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
    ab3 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 130.81513484855705;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought314.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld3 = 843.540741952069;
    Thought lo4 = Thought301.getInstance(fd0, fd1, ld0, ld3);
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld3, fd0);
}
    ab4 = !fb0;
    fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3();
}
        fb1 = lb2 || ab1;
    ld3 = fd0 + fd1;
    ld0 = ld3 + fd0;
    double ld5 = 869.3210499184892;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought62.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < ad1;
    ad2 *= -1;
    ad3 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought209.getInstance(fo1, fo0, fo1, fo0);

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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m3();
}
    ab1 = ad4 > fd0;
    Thought lo0 = Thought221.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd1 > ad1;
    boolean lb1 = true;
    lb1 = !ab1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    fb1 = lb1 || ab1;
    Thought lo2 = Thought140.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    fb1 = ad2 < ad3;
    Thought lo3 = Thought131.getInstance(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
    Thought lo4 = Thought94.getInstance(fo0, fo1, fo0, fo1);
    boolean lb5 = true;
    boolean lb6 = true;
    ad4 *= -1;
    ab2 = fd0 > fd1;
    ad1 *= -1;
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    double ld8 = 316.7443739308772;
    ad3 *= -1;

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
    Thought lo0 = Thought282.getInstance();
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    fd0 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = !fb0;
        boolean lb1 = false;
    if (fb0) {
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
        fb0 = fb1 || lb1;
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
    fb0 = ad1 < ad2;
    double ld0 = 596.1591740996187;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        double ld1 = 890.7382752453184;
        fb1 = fb0 && fb1;
        fb0 = fd0 < fd1;
        fb1 = ld1 > ld0;
        boolean lb2 = true;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        double ld3 = 79.46023172389918;
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
    Thought lo0 = Thought150.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    if (ab1) {
        boolean lb2 = true;
if(ao2 != null){
          ao2.m1();
}
        Output.points[5][8] += fd0;
        double ld3 = 997.3151362112048;
        ab1 = ab2 || ab3;
if(ao3 != null){
          ao3.m3(ab4, fb0, fb1, lb2);
}
        lb1 = fd0 < fd1;
        double ld4 = 953.1025410524044;
        ld3 = ld4 - fd0;
        fd1 = ld3 - ld4;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    double ld0 = 851.7176254303843;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, ld0, ad1, ad2);
}
    Thought lo1 = Thought318.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
    ld0 *= -1;
    ab3 = ad1 < ad2;
    ab4 = ad3 > ad4;
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    Output.points[6][0] += ad4;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
    boolean lb2 = true;
    Thought lo3 = Thought75.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    if (ab2) {
        double ld4 = 333.19363577967107;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    double ld0 = 670.5518787230845;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb1;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    boolean lb2 = true;
        Thought lo3 = Thought85.getInstance(lb2, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
}
    Thought lo4 = Thought138.getInstance(fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
    fd1 = ld0 + fd0;
    lb2 = fd1 > ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    lb0 = fd0 > fd1;
    ab1 = !ab2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    if (ab3) {
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        ab4 = fd0 > fd1;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        Thought lo1 = Thought6.getInstance();
        fb0 = fb1 && lb0;
        Thought lo2 = Thought290.getInstance(ab1, ab2, ab3, ab4);
        fb0 = !fb1;
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
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought360.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = ad1 > ad2;
    double ld1 = 588.0051309998379;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(ad2, ad3, ad4, fd0);
}
    ab3 = ab4 && fb0;
    fb1 = fd1 < ad1;
    double ld0 = 712.2492861747089;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Thought lo1 = Thought162.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb2 = true;
    lb0 = !lb2;
    fd1 *= -1;
    double ld3 = 476.3662520529718;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb4 = false;
    boolean lb5 = true;
    ld3 *= -1;
    lb4 = fd0 > fd1;
if(ao3 != null){
      ld3 = ao3.m3(lb5, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld3, fd0, lb2, lb4, lb5, fb0);
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[6][1] += fd0;
    Thought lo0 = Thought146.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 > ad1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = !fb0;
        fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    Thought lo0 = Thought61.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    double ld1 = 549.6306007886735;
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    Thought lo2 = Thought312.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb3 = true;
    fd0 = fd1 + ld1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, fd0);
}
    double ld4 = 862.054267789745;
    fd0 *= -1;
    Thought lo5 = Thought96.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, ld4, fd0);
    fd1 = ld1 + ld4;
    lb3 = fd0 < fd1;
    ld1 = ld4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4();
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
    ab2 = ad1 > ad2;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought89.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ad1 = ao1.m3();
}
    boolean lb1 = true;
if(ao2 != null){
      ad2 = ao2.m3(ab4, fb0, fb1, lb1);
}
    ad3 *= -1;
    Thought lo2 = Thought199.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
    ab2 = ad3 < ad4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + ad1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 866.459249282222;
    ld0 = fd0 + fd1;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        lb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = ld0 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
        fb0 = fb1 || lb1;
        fb0 = fb1 && lb1;
        double ld2 = 699.6952766300697;
        fb0 = !fb1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld2, ld0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
        }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = fb0 && fb1;
    boolean lb3 = false;
if(fo1 != null){
      lb1 = fo1.m2(lb3, fb0, fb1, lb1);
}
    lb3 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb1, lb3, fb0, fb1);
}
    lb1 = ld0 > fd0;
    Output.points[6][2] += fd1;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 577.8576260401592;
    Thought lo1 = Thought22.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = ld0 < fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1);
}
    Thought lo2 = Thought24.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought276.getInstance(fb0, fb1, ab1, ab2);
    ab3 = fd0 < fd1;
    ab4 = ld0 < fd0;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb4);
}
    ld0 = fd0 + fd1;
    Thought lo5 = Thought197.getInstance(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb4, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3();
}
    Output.points[6][3] -= ad4;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
        fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb0;

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
      ab2 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = !ab1;
    boolean lb0 = true;
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad3 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
}
    ad3 = ad4 - fd0;
    if (ab3) {
if(fo1 != null){
          fo1.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
        Thought lo1 = Thought46.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
        Thought lo2 = Thought39.getInstance(fo0, fo1, fo0, fo1);
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
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 71.59682968676164;
    Thought lo1 = Thought359.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    fb0 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;

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
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        fd1 = ad1 - ad2;
        ad3 *= -1;
        }
    Thought lo0 = Thought191.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb1 = false;
    lb1 = ad3 < ad4;
    Output.points[6][4] -= fd0;
    if (fb0) {
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
    ab1 = fd1 > fd0;
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        double ld0 = 48.92180881829567;
        fb1 = ld0 < fd0;
        boolean lb1 = false;
        fd1 *= -1;
        lb1 = ab1 || ab2;
        ab3 = !ab4;
        ld0 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
      ao2.m1();
}
    Thought lo0 = Thought193.getInstance(ab2, ab3, ab4, fb0);
    ad1 = ad2 + ad3;
    fb1 = ab1 || ab2;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    Output.points[6][5] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought224.getInstance(ao3, ao4, fo0, fo1);
    Thought lo2 = Thought17.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    ab4 = fb0 || fb1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld0 = 911.2049534453412;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought368.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought331.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    Output.points[6][6] += fd0;
    Thought lo3 = Thought150.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fd1 > ld0;

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
    double ld0 = 457.020302022978;
    fb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < ld0;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m3();
}
    double ld1 = 216.23971245713366;
    fb0 = fd0 > fd1;
if(fo0 != null){
          ld0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    ld1 = fd0 + fd1;
    ld0 = ld1 + fd0;
    fb1 = fd1 > ld0;
    ld1 = fd0 - fd1;

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
    Output.points[6][7] += fd0;
    fb0 = fd1 < fd0;
    Output.points[6][8] -= fd1;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;

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
