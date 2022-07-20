package genetic;
import java.util.ArrayList;
class Thought276 extends Thought{
private static ArrayList<Thought276> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 856.833609825938;
private double fd1 = 674.6047752690815;
private Thought fo0 = null;
private Thought fo1 = null;
Thought276 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought276 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought276 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought276 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought276 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought276 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought276 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought276 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought276 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought276 instance = new Thought276 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought276 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought276 instance = new Thought276 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought276 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought276 instance = new Thought276 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought276 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought276 instance = new Thought276 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought276 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought276 instance = new Thought276 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought276 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought276 instance = new Thought276 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought276 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought276 instance = new Thought276 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought276 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought276 instance = new Thought276 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought74.getInstance();
        fb0 = fb1 && fb0;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
        fb1 = fb0 && fb1;
        Thought lo1 = Thought387.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
        fd0 = fd1 - fd0;
        Thought lo2 = Thought380.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        fb0 = fd1 < fd0;
        Output.points[5][0] += fd1;
        fb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fb0 = fo1.m2();
}
        double ld3 = 483.2356890350294;
        } else if (fb1) {
        fd0 = fd1 + fd0;
        Thought lo4 = Thought153.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < fd0;
        double ld5 = 201.00450444098914;
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
    fd1 *= -1;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    double ld0 = 271.64833325662397;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ab2 = fo1.m2(fd0, fd1, ld0, fd0);
}
    Output.points[5][1] += fd1;
    if (ab3) {
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
        Thought lo1 = Thought76.getInstance();
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
        double ld3 = 61.11377257753659;
        fb0 = fd0 > fd1;
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
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    ad1 *= -1;
    lb0 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = ad2 > ad3;
    Output.points[5][2] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 *= -1;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;

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
    double ld0 = 879.6985365358979;
    Output.points[5][3] -= ld0;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1();
}
    Thought lo2 = Thought236.getInstance(lb1, ab1, ab2, ab3);
    ad4 = fd0 - fd1;
    ab4 = fb0 || fb1;
    Output.points[5][4] -= ld0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
        fd0 = fd1 + fd0;
        boolean lb0 = false;
        boolean lb1 = false;
        fd1 = fd0 - fd1;
        lb1 = fd0 < fd1;
        Thought lo2 = Thought379.getInstance(fd0, fd1, fd0, fd1);
        fb0 = fb1 && lb0;
        boolean lb3 = true;
        double ld4 = 667.9082761601328;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ld4, fd0, fd1, ld4);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        lb1 = fd0 > fd1;
        Thought lo5 = Thought270.getInstance(lb3, fb0, fb1, lb0);
        lb1 = !lb3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, fd0, fd1, ld4, fb0, fb1, lb0, lb1);
}
        lb3 = fd0 < fd1;
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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[5][5] -= fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought128.getInstance();
    ab3 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m3(ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;
    boolean lb2 = true;

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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    Output.points[5][6] += fd1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    lb0 = !ab1;
    ab2 = ab3 || ab4;
    if (fb0) {
        double ld1 = 763.8490155785915;
        fb1 = lb0 || ab1;
        ab2 = fd0 < fd1;
        ld1 = ad1 - ad2;
        ab3 = ab4 && fb0;
        Output.points[5][7] += ad3;
        ad4 = fd0 - fd1;
if(fo0 != null){
          ao4 = fo0.m4();
}
        boolean lb2 = false;
if(fo1 != null){
          fo1.m2(fb0, fb1, lb2, lb0);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought67.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    if (fb1) {
        } else if (lb1) {
        fb0 = fb1 && lb1;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb1 = fd0 < fd1;
        Thought lo3 = Thought313.getInstance(fb0, fb1, lb2, lb1);
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
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Output.points[5][8] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    lb0 = ab1 && ab2;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    Output.points[6][0] -= fd1;
    ab2 = ab3 && ab4;
        double ld2 = 527.9319928157355;
    ld2 *= -1;
    boolean lb3 = false;
    if (ab4) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
        fb0 = fb1 || lb0;
        Output.points[6][1] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb1 = lb3 && ab1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought283.getInstance(fb1, fb0, fb1, fb0);
    double ld1 = 237.36562351217188;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ad1, ad2);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;

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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            ab1 = fd1 > ad1;
            double ld1 = 583.0102692903804;
            ab2 = !ab3;
if(fo1 != null){
              fo0 = fo1.m4();
}
            ad1 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
            Output.points[6][2] -= ad2;
            ab1 = ad3 > ad4;
            Output.points[6][3] -= fd0;
            Thought lo2 = Thought51.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
            Output.points[6][4] -= ad3;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 802.6158623349643;
    Thought lo1 = Thought276.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao1 != null){
      ld0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    lb2 = fd0 > fd1;
    boolean lb3 = false;
    lb3 = ld0 > fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb0, fb1, lb2, lb3);
}
    Thought lo4 = Thought336.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
    Thought lo5 = Thought295.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb2, lb3);
    Output.points[6][5] += fd0;
    fd1 *= -1;
    Thought lo6 = Thought33.getInstance(ao1, ao2, ao3, ao4);
    Output.points[6][6] += ld0;
    fb0 = fb1 || lb2;
    boolean lb7 = false;
    Thought lo8 = Thought266.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
    double ld9 = 125.50819792587386;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought35.getInstance();
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    Output.points[6][7] += ad3;
if(ao2 != null){
      ad4 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    Output.points[6][8] -= ad1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    lb1 = fd1 > ad1;
    if (fb0) {
        boolean lb2 = false;
        ad2 *= -1;
        fb0 = ad3 > ad4;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo0 = Thought109.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 + fd1;
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
    fd1 *= -1;
    fb1 = lb1 || ab1;
    if (ab2) {
        boolean lb2 = false;
        fd0 = fd1 + fd0;
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb2, lb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fb1 = lb2 && lb1;
        double ld3 = 35.20849785465469;
if(fo0 != null){
          fo0.m2(ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
        boolean lb4 = true;
        fd0 *= -1;
        ab4 = fb0 || fb1;
        double ld5 = 198.58879583284823;
        fd0 = fd1 - ld3;
if(fo1 != null){
          ld5 = fo1.m3(ao1, ao2, ao3, ao4, lb2, lb4, lb1, ab1);
}
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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought228.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
      ab2 = fo1.m2();
}
    boolean lb1 = false;
    boolean lb2 = true;
    Output.points[7][0] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = !lb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb2, lb3, ab1, ab2);
}
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb1 = lb2 && lb3;
        ab1 = !ab2;
        Thought lo4 = Thought181.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
        ad1 *= -1;
        boolean lb5 = false;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        ad2 = ad3 - ad4;
        Thought lo6 = Thought224.getInstance(fd0, fd1, ad1, ad2);
if(ao2 != null){
          lb5 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    Output.points[7][1] += fd0;
    Thought lo1 = Thought70.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    Thought lo2 = Thought83.getInstance(fo0, fo1, fo0, fo1);
    lb0 = !fb0;
    fd1 = fd0 - fd1;
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
    Thought lo5 = Thought118.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb6 = true;
if(fo1 != null){
      lb4 = fo1.m2();
}
if(fo0 != null){
      lb6 = fo0.m2(fb0, fb1, lb0, lb3);
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
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        Thought lo3 = Thought34.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
        Thought lo4 = Thought16.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, lb0, lb1, lb2, ab1);
}
        boolean lb5 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 + fd0;
        if (ab1) {
            ab2 = ab3 || ab4;
            Thought lo6 = Thought320.getInstance(fd1, fd0, fd1, fd0);
            fb0 = !fb1;
            boolean lb7 = false;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
        fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    ad4 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    if (fb0) {
        Output.points[7][2] += fd0;
        Thought lo2 = Thought10.getInstance(fd1, ad1, ad2, ad3);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Output.points[7][3] += ad4;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
    ab2 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ab3 = ad2 < ad3;
    boolean lb1 = true;
if(fo1 != null){
      ad4 = fo1.m3();
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
    fd0 = fd1 + ad1;
    Thought lo2 = Thought178.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;

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
    double ld0 = 525.9875284948557;
    fb0 = ld0 > fd0;
    fd1 = ld0 - fd0;
        fd1 = ld0 - fd0;
    Output.points[7][4] -= fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
}
    double ld1 = 13.273306044049914;
    ld1 = fd0 + fd1;
    ld0 = ld1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Output.points[7][5] += ld0;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    ld1 = fd0 - fd1;
    ld0 *= -1;
    boolean lb2 = false;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1, lb2, fb0, fb1, lb2);
}
    boolean lb3 = true;

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
    fb1 = ad2 < ad3;
    fb0 = ad4 < fd0;
    fb1 = fd1 > ad1;
    fb0 = ad2 > ad3;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought32.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb0 = !fb1;
    double ld1 = 917.5843120079337;

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
    ab1 = !ab2;
    fd1 *= -1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ab1 = ao2.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab4 = ao3.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    boolean lb0 = false;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;

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
        Thought lo0 = Thought230.getInstance();
    ab1 = !ab2;
    ab3 = ad2 < ad3;
if(ao2 != null){
      ao2.m3(ab4, fb0, fb1, ab1);
}
    Output.points[7][6] -= ad4;
    boolean lb1 = true;
    double ld2 = 404.28280671888945;
    Thought lo3 = Thought332.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
    boolean lb4 = true;
    ad1 = ad2 - ad3;
    ab4 = fb0 && fb1;
    double ld5 = 946.3922523690301;
    lb1 = ad3 > ad4;
    double ld6 = 831.2261276603871;
    lb4 = ab1 && ab2;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    ld5 = ld6 - ad1;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, lb4, ab1, ab2, ab3);
}
    Thought lo7 = Thought105.getInstance(ao1, ao2, ao3, ao4);

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
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought125.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Output.points[7][7] -= fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    double ld2 = 457.4305974024578;
    fb0 = fd0 > fd1;
    ld2 *= -1;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4();
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Thought lo0 = Thought148.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 < fd0;
    ab1 = !ab2;
    fd1 = fd0 - fd1;
    if (ab3) {
        fd0 = fd1 - fd0;
        ab4 = fd1 < fd0;
        fb0 = fb1 && ab1;
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
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought92.getInstance(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = ad2 < ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld3 = 749.9698616743299;
    boolean lb4 = false;
    lb4 = fb0 || fb1;
    if (lb0) {
        ad3 *= -1;
        ad4 = fd0 - fd1;
        lb1 = ld3 < ad1;
        ad2 = ad3 - ad4;
        fd0 *= -1;
if(fo1 != null){
          fo1.m3(fd1, ld3, ad1, ad2);
}
if(fo0 != null){
          lb4 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought107.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    Output.points[7][8] += ad4;
    Output.points[8][0] += fd0;
        fd1 = ad1 - ad2;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 > ad2;
    ad3 = ad4 - fd0;
    Output.points[8][1] += fd1;
    boolean lb1 = false;
    ad1 *= -1;
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
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
    fd1 *= -1;
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fb1 = fb0 || fb1;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        double ld0 = 827.9015914882949;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
        fb0 = fb1 && fb0;
        }
    fb1 = fd1 > fd0;
    Thought lo1 = Thought136.getInstance();
        boolean lb2 = false;
    Thought lo3 = Thought238.getInstance(lb2, fb0, fb1, lb2);
    boolean lb4 = false;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought111.getInstance(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;

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
    fb1 = !ab1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 317.1738810820305;
    fd0 *= -1;
    Thought lo1 = Thought61.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
        ab2 = ld0 < fd0;
    ab3 = !ab4;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4();
}
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
    Thought lo0 = Thought248.getInstance(ab1, ab2, ab3, ab4);
    Thought lo1 = Thought277.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    ab3 = fd0 < fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo3 = Thought161.getInstance();
if(ao1 != null){
      ao1.m1(fb1, lb2, ab1, ab2);
}
    Thought lo4 = Thought8.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
        Thought lo5 = Thought264.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb2);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = !ab2;
    ad4 *= -1;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab3 = ad1 > ad2;
    Thought lo6 = Thought26.getInstance();
    ad3 = ad4 + fd0;
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
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 269.5843265887387;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought96.getInstance(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
    fb0 = !fb1;
    boolean lb2 = true;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[8][2] += fd1;
    double ld3 = 956.8963441602035;
    ld0 = ld3 - fd0;
    Output.points[8][3] -= fd1;
    Thought lo4 = Thought203.getInstance(ld0, ld3, fd0, fd1);
    Output.points[8][4] -= ld0;
        ld3 = fd0 - fd1;
        fb1 = !lb2;
    ld0 = ld3 + fd0;
    fd1 = ld0 + ld3;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    double ld0 = 581.0621469331711;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    double ld2 = 809.1516810541633;
    fb0 = ld0 > ld2;
    Thought lo3 = Thought64.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
    boolean lb4 = true;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb5 = false;
    boolean lb6 = false;
    ld2 *= -1;
    boolean lb7 = false;
    Thought lo8 = Thought119.getInstance(fd0, fd1, ld0, ld2);
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
}
    Output.points[8][5] -= ld2;
    Thought lo9 = Thought350.getInstance();

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
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    double ld0 = 974.6257511743768;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    double ld1 = 136.13454674487323;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    ld0 = ld1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1);
}
    Thought lo3 = Thought176.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb2, fb0, fb1);
}
        Thought lo4 = Thought195.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
    fb0 = ld1 > fd0;
    fd1 = ld0 + ld1;

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
