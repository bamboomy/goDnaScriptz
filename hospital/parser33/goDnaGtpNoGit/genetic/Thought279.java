package genetic;
import java.util.ArrayList;
class Thought279 extends Thought{
private static ArrayList<Thought279> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 750.2860492665467;
private double fd1 = 16.379638801929556;
private Thought fo0 = null;
private Thought fo1 = null;
Thought279 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought279 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought279 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought279 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought279 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought279 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought279 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought279 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought279 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought279 instance = new Thought279 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought279 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought279 instance = new Thought279 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought279 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought279 instance = new Thought279 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought279 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought279 instance = new Thought279 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought279 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought279 instance = new Thought279 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought279 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought279 instance = new Thought279 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought279 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought279 instance = new Thought279 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought279 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought279 instance = new Thought279 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
    Output.points[6][4] -= fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    Output.points[6][5] -= fd0;
    double ld2 = 579.1628282999487;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    double ld4 = 394.1022748040444;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld2);
}
    lb1 = !lb3;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld2);
}
    Output.points[6][6] += ld4;
    Output.points[6][7] += fd0;

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
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    double ld1 = 847.1046480499233;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld1, fd0, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought201.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb0 = ab1 || ab2;
    ab3 = ld1 > fd0;

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
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    fd0 *= -1;
    double ld0 = 768.177438717833;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    ld0 = ad1 + ad2;
    fb1 = !fb0;
    ad3 = ad4 - fd0;
    boolean lb1 = true;
    fd1 = ld0 - ad1;
    fb0 = ad2 > ad3;
    double ld2 = 425.60132633738385;
    boolean lb3 = false;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, fb1, lb1, lb3, fb0);
}
    ad1 *= -1;
    boolean lb4 = true;
    Thought lo5 = Thought13.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb3);
    Output.points[6][8] -= fd1;
    Output.points[7][0] += ld0;
    lb4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb3, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb6 = true;

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
    ad2 = ad3 + ad4;
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    ab4 = !fb0;
    Thought lo1 = Thought236.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    Thought lo2 = Thought332.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    boolean lb3 = true;
    lb3 = fd1 < ad1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb3;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    lb3 = ab1 || ab2;
    ad2 *= -1;
    ab3 = !ab4;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought387.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
    fd1 *= -1;
    boolean lb2 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[7][1] -= fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought347.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    double ld4 = 356.6074321931104;
if(ao2 != null){
      ao1 = ao2.m4();
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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < ad1;
    double ld1 = 49.44578922719406;
    boolean lb2 = false;
    lb0 = !lb2;
    ad1 *= -1;
    ad2 *= -1;
if(ao2 != null){
      ao2.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb2);
}
    ld1 = ad1 + ad2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - fd0;
    lb0 = ab1 && ab2;
    fd1 *= -1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    Output.points[7][2] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(ao4 != null){
      ao4.m2();
}
    Thought lo2 = Thought271.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    ab4 = fd0 < fd1;
    Thought lo3 = Thought327.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fb1 = ab1 || ab2;
    double ld0 = 824.9732825224694;
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4();
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
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;

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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    Thought lo0 = Thought103.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    double ld1 = 995.4343355790886;
    ab1 = !ab2;
    Thought lo2 = Thought135.getInstance();
    double ld3 = 626.4815767210417;
    ld1 = ld3 + fd0;
    double ld4 = 581.2608909906063;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld1;
    fb1 = lb5 && ab1;
    Output.points[7][3] -= ld3;
    ld4 *= -1;
    fd0 *= -1;
    Thought lo6 = Thought124.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ld3, ld4, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld3, fb1, lb5, ab1, ab2);
}
    ld4 = fd0 - fd1;
    double ld7 = 994.0181883945016;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    double ld0 = 51.03599910835752;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought196.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    Output.points[7][4] -= ld0;
    fb1 = !fb0;
    fb1 = ad1 > ad2;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 = ad1 - ad2;

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
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    fd1 *= -1;
    ad1 *= -1;
    ab1 = ab2 && ab3;
    ab4 = ad2 < ad3;
    ad4 *= -1;
    Thought lo1 = Thought373.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);

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
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    if (fb1) {
        fb0 = fd0 > fd1;
        } else {
        Thought lo0 = Thought83.getInstance(ao1, ao2, ao3, ao4);
        Thought lo1 = Thought281.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
        Thought lo2 = Thought301.getInstance();
        if (fb1) {
            fb0 = fb1 || fb0;
            fb1 = fb0 || fb1;
            fb0 = fd1 > fd0;
if(ao4 != null){
              fd1 = ao4.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
              fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[7][5] -= fd0;
    Output.points[7][6] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    boolean lb1 = true;
    double ld2 = 130.33616316797543;
    ad3 = ad4 - fd0;
    Output.points[7][7] -= fd1;
    Thought lo3 = Thought383.getInstance(ao3, ao4, fo0, fo1);
    Thought lo4 = Thought168.getInstance(ld2, ad1, ad2, ad3);
    lb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2);
}
    boolean lb5 = false;
if(ao1 != null){
      ad1 = ao1.m3();
}
if(ao2 != null){
      ao2.m3(lb0, lb1, lb5, fb0);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Output.points[7][8] += fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3, lb0, lb1, lb5, fb0);
}
    ad4 *= -1;
    fd0 = fd1 - ld2;
    ad1 = ad2 - ad3;
    boolean lb6 = false;
    fb0 = ad4 > fd0;
    fd1 = ld2 + ad1;

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
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    Output.points[8][0] += fd0;
    fb1 = !ab1;
    Thought lo0 = Thought301.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab4 = !fb0;
    Output.points[8][1] += fd1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[8][2] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;

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
    ab1 = ad1 < ad2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought241.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    ab4 = ad3 > ad4;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fb0 = !fb1;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought24.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
    ab3 = ab4 && fb0;
    fb1 = ad2 > ad3;
if(fo0 != null){
      ao4 = fo0.m4();
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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[8][3] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 470.4441381948822;
    fd0 = fd1 + ld0;
    Output.points[8][4] += fd0;

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
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    double ld3 = 140.82842394408277;
    Thought lo4 = Thought90.getInstance();
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = !lb0;
    lb1 = lb2 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1, lb0, lb1, lb2, ab1);
}
    ld3 = fd0 - fd1;
    ld3 = fd0 + fd1;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld3;
    Thought lo6 = Thought217.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
    boolean lb7 = true;
    lb2 = fd0 > fd1;
    lb5 = lb7 || ab1;
    double ld8 = 360.277417601228;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    double ld0 = 24.309911404924204;
    ad3 = ad4 + fd0;
    fd1 = ld0 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo1 = Thought148.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
    boolean lb2 = false;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo1.m3();
}
    boolean lb3 = false;

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
    ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    double ld1 = 586.2487582708184;
    ab2 = ad4 > fd0;
    fd1 *= -1;
    Thought lo2 = Thought216.getInstance(fo1, fo0, fo1, fo0);
    if (ab3) {
        boolean lb3 = false;
if(fo1 != null){
          ab3 = fo1.m2(ld1, ad1, ad2, ad3);
}
        Thought lo4 = Thought137.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
if(fo0 != null){
          fo0.m1();
}
        ab4 = ad1 < ad2;
        fb0 = ad3 > ad4;
if(fo1 != null){
          fo1.m2(fb1, lb3, lb0, ab1);
}
        Output.points[8][5] -= fd0;
        ab2 = fd1 < ld1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, ad1, lb3, lb0, ab1, ab2);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    fb0 = fd1 > fd0;
    boolean lb1 = false;
    Thought lo2 = Thought130.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    double ld3 = 27.24081457683798;
if(fo0 != null){
      fb1 = fo0.m2(ld3, fd0, fd1, ld3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0);
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
    fb0 = fb1 || fb0;
    double ld0 = 485.6873628299032;
    Thought lo1 = Thought87.getInstance();
    boolean lb2 = true;
    ld0 *= -1;
    ad1 *= -1;
    fb0 = fb1 && lb2;
    fb0 = fb1 || lb2;
    boolean lb3 = false;
    ad2 *= -1;
    lb3 = fb0 || fb1;
    Output.points[8][6] -= ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ld0 = ao2.m3(lb2, lb3, fb0, fb1);
}
    Thought lo4 = Thought132.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb2, lb3, fb0, fb1);
    lb2 = fd0 > fd1;

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
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb0 = false;
    lb0 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought38.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
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
    Thought lo0 = Thought28.getInstance();
    Output.points[8][7] -= ad2;
    Output.points[8][8] += ad3;
    ab1 = !ab2;
if(ao2 != null){
      ao2.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ad4 > fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    lb1 = lb2 || ab1;
        ab2 = ab3 || ab4;
    fb0 = fb1 && lb1;
    lb2 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    lb1 = lb2 && ab1;
    ab2 = ab3 && ab4;
    if (fb0) {
        fd0 *= -1;
if(ao4 != null){
          ao4.m1();
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    Thought lo0 = Thought151.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][0] -= fd0;
    Thought lo1 = Thought341.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    Thought lo2 = Thought181.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;

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
    ab1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab2 = !ab3;
    boolean lb0 = false;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m2(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        ab2 = fd0 > fd1;
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
    ad1 *= -1;
    double ld0 = 353.40516292182843;
    double ld1 = 727.603874587833;
if(fo1 != null){
      ld1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    boolean lb2 = false;
if(fo1 != null){
      ld1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought217.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 + ld1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    lb2 = fb0 || fb1;
    ad1 *= -1;
if(fo1 != null){
      fo1.m2();
}
    lb2 = ad2 < ad3;
    fb0 = fb1 || lb2;
if(fo0 != null){
      ad4 = fo0.m3(fb0, fb1, lb2, fb0);
}
    fd0 = fd1 - ld0;
    fb1 = ld1 < ad1;
    ad2 *= -1;
    boolean lb4 = true;
    ad3 = ad4 + fd0;
    lb2 = fd1 < ld0;
    ld1 = ad1 - ad2;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    Output.points[0][1] += ad1;
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    double ld2 = 569.0077513206896;
    ab1 = ld2 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ad3 < ad4;

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
    fd1 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought216.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
        Thought lo1 = Thought244.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought125.getInstance(fo0, fo1, ao1, ao2);
    fd1 = fd0 - fd1;

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
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
if(ao2 != null){
      fb0 = ao2.m2(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
    fb0 = ad3 > ad4;
if(ao4 != null){
      ao4.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
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
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld0 = 744.5025024172571;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought244.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
    ab1 = ab2 || ab3;
    Thought lo2 = Thought255.getInstance();
if(fo1 != null){
      ld0 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
    ab3 = ld0 < fd0;
    ab4 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        Output.points[0][2] += fd1;
        ld0 = fd0 + fd1;
        ld0 = fd0 - fd1;
        double ld3 = 529.3601057287276;
        ld3 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
        Output.points[0][3] -= ld0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 369.94968002924884;
    double ld1 = 455.82204774196754;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ad3 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = ab1 && ab2;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, ld1);
}
        ad1 = ad2 + ad3;
        ab3 = ab4 || fb0;
        double ld2 = 675.7836516655532;
        fb1 = ab1 && ab2;
        ad3 = ad4 - fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld2, ld0, ld1, ad1);
}
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
      fo1 = fo0.m4();
}
    double ld0 = 116.18536663389003;
    double ld1 = 834.5778989794478;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ld1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought130.getInstance(fd0, fd1, ld0, ld1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    fd0 = fd1 - ld0;
        ld1 = fd0 + fd1;

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
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought62.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    Output.points[0][4] += fd1;
    lb1 = fb0 && fb1;
    lb1 = !fb0;
    boolean lb2 = false;
    Thought lo3 = Thought73.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][5] += fd0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 < fd1;
    double ld1 = 917.1048609812002;
    fb1 = lb0 || fb0;
        fb1 = lb0 && fb0;
        ld1 = fd0 + fd1;
    double ld2 = 771.9139033726752;
    fb1 = ld1 < ld2;
    fd0 *= -1;
    boolean lb3 = true;
    Output.points[0][6] -= fd1;
    ld1 = ld2 - fd0;

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
