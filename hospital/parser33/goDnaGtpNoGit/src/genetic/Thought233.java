package genetic;
import java.util.ArrayList;
class Thought233 extends Thought{
private static ArrayList<Thought233> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 26.136798318100446;
private double fd1 = 923.3237202166667;
private Thought fo0 = null;
private Thought fo1 = null;
Thought233 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought233 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought233 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought233 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought233 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought233 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought233 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought233 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought233 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought233 instance = new Thought233 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought233 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought233 instance = new Thought233 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought233 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought233 instance = new Thought233 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought233 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought233 instance = new Thought233 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought233 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought233 instance = new Thought233 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought233 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought233 instance = new Thought233 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought233 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought233 instance = new Thought233 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought233 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought233 instance = new Thought233 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought28.getInstance(fo1, fo0, fo1, fo0);
    Output.points[0][0] -= fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought288.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo2 = Thought162.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[0][1] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3();
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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought202.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
        fd1 *= -1;
    double ld1 = 287.96489478824424;
    Thought lo2 = Thought165.getInstance(ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo3 = Thought121.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 && ab4;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    boolean lb0 = false;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought212.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
    fb0 = ad1 < ad2;
    boolean lb3 = false;

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
    ab2 = !ab3;
    Output.points[0][2] -= ad1;
    Thought lo0 = Thought236.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || ab1;
    ab2 = fd1 < ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 < fd0;
    boolean lb1 = false;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought153.getInstance(fo1, fo0, fo1, fo0);
    ab1 = ad4 < fd0;
    fd1 = ad1 - ad2;
    ab2 = ab3 && ab4;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb1 = false;
    Output.points[0][3] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb0);
}
    Output.points[0][4] -= fd1;
    lb1 = fb0 || fb1;
    fd0 *= -1;
    lb0 = lb1 || fb0;
    fd1 = fd0 - fd1;
    double ld2 = 166.44153244052825;
    boolean lb3 = false;
    ld2 *= -1;
    fb0 = fd0 < fd1;
    ld2 = fd0 + fd1;
    boolean lb4 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
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
    fb0 = ad2 < ad3;
if(ao2 != null){
      fb1 = ao2.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m2(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      lb0 = ao1.m2();
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
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    double ld0 = 770.7483266748484;
    ab4 = fb0 || fb1;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ld0 = fd0 + fd1;
    Thought lo1 = Thought163.getInstance(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = ab1 && ab2;
        } else {
        fd0 = fd1 + ld0;
        ab3 = !ab4;
        fb0 = fb1 && ab1;
        ab2 = !ab3;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ab4 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(ld0, fd0, fd1, ld0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    Thought lo0 = Thought35.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      ad2 = fo1.m3();
}
if(ao1 != null){
      ad3 = ao1.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought34.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd1 > ad1;
    ad2 = ad3 + ad4;
    ab1 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    double ld2 = 831.6583681026971;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought230.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    Thought lo1 = Thought243.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3();
}
    if (fb1) {
        fb0 = fd1 < fd0;
        boolean lb2 = true;
        fb0 = fd1 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
        double ld3 = 543.1672952136825;
        fb0 = !fb1;
        lb2 = fb0 || fb1;
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + fd0;
        boolean lb4 = false;
if(fo0 != null){
          lb4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb4, fb0);
}
        Thought lo5 = Thought149.getInstance(fo1, fo0, fo1, fo0);
        Output.points[0][5] -= fd1;
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
    Thought lo0 = Thought289.getInstance(fd0, fd1, fd0, fd1);
    ab2 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought70.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab3 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fd0 > fd1;
    fb0 = fb1 && ab1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought357.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    Thought lo3 = Thought246.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    Thought lo4 = Thought252.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    fb1 = !fb0;
    Output.points[0][6] -= ad3;
    fb1 = fb0 && fb1;
    ad4 *= -1;
    boolean lb0 = false;
    boolean lb1 = true;
    fd0 *= -1;
    boolean lb2 = false;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[0][7] += ad1;
    ad2 = ad3 - ad4;
    boolean lb3 = true;
    Thought lo4 = Thought254.getInstance(fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb0 = lb1 && lb2;
    lb3 = !fb0;
    fb1 = lb0 || lb1;
    Output.points[0][8] += ad1;
if(fo0 != null){
      fo0.m1();
}
    lb2 = lb3 && fb0;
    fb1 = lb0 && lb1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
        double ld0 = 824.0529363496036;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    double ld2 = 756.3192858178683;
    ad4 = fd0 - fd1;
    Thought lo3 = Thought215.getInstance(ld0, ld2, ad1, ad2, lb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    double ld4 = 31.391873256296446;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ld4);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb5 = false;
    ad2 *= -1;
    ab3 = ab4 && fb0;
    Thought lo6 = Thought69.getInstance(fb1, lb1, lb5, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(ld2, ld4, ad1, ad2, lb1, lb5, ab1, ab2);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought240.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 996.3419799691021;
    double ld2 = 526.9303835838724;
    fb0 = ld2 > fd0;
    Thought lo3 = Thought268.getInstance(fd1, ld1, ld2, fd0, fb1, fb0, fb1, fb0);
    fd1 = ld1 - ld2;
    fd0 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought274.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld1, ld2, fd0);
}
    fd1 = ld1 + ld2;
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
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
    double ld0 = 832.1122929075104;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ad3 = ad4 - fd0;
    double ld1 = 534.326398673981;
    fb0 = fd0 > fd1;
    Output.points[1][0] += ld0;
if(ao3 != null){
      ao2 = ao3.m4(ld1, ad1, ad2, ad3);
}
    boolean lb2 = true;

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
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    Thought lo0 = Thought385.getInstance();
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought365.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fd0 = fd1 + fd0;
    boolean lb2 = true;
    double ld3 = 736.3283493036402;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb2);
}
    ab1 = fd0 < fd1;
    Thought lo4 = Thought236.getInstance(ao2, ao3, ao4, fo0);
    ld3 = fd0 + fd1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fo1 = ao1.m4(ld3, fd0, fd1, ld3);
}
    fb0 = fd0 > fd1;
    ld3 = fd0 - fd1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3);
}
    fd0 = fd1 - ld3;
    fd0 = fd1 + ld3;
    lb2 = ab1 || ab2;
    fd0 *= -1;
    ab3 = fd1 > ld3;
    double ld5 = 791.2682146851333;

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
    ab2 = !ab3;
    Output.points[1][1] += ad2;
if(ao1 != null){
      ad3 = ao1.m3();
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab2 = ao3.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    double ld1 = 686.4763139287221;
    boolean lb2 = false;
if(ao4 != null){
      ao4.m3();
}
    if (ab2) {
        ab3 = ab4 && fb0;
        Thought lo3 = Thought25.getInstance(fb1, lb0, lb2, ab1);
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    fd1 *= -1;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    fb1 = !lb0;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
    fb0 = fb1 && lb0;
    Output.points[1][2] += fd0;
    lb1 = fd1 < fd0;
    Thought lo2 = Thought256.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    if (lb1) {
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
    fd1 = fd0 + fd1;
        double ld0 = 773.0325436499587;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    ld0 = fd0 + fd1;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    ab2 = !ab3;
    boolean lb3 = true;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb1 = lb1 && lb2;
    Thought lo4 = Thought36.getInstance();
    ld0 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3(lb3, ab1, ab2, ab3);
}
    double ld5 = 680.8445467141161;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
    ld5 = fd0 + fd1;
if(fo0 != null){
      lb2 = fo0.m2(ld0, ld5, fd0, fd1, lb3, ab1, ab2, ab3);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][3] += ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    Thought lo0 = Thought58.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2);
}
    lb1 = ad3 < ad4;
    double ld2 = 172.68362656801227;
        fb0 = !fb1;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    Thought lo2 = Thought129.getInstance();
if(fo0 != null){
      lb0 = fo0.m2(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    lb1 = ab1 && ab2;
    ab3 = !ab4;
        Output.points[1][4] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    double ld3 = 247.78691572337496;
    boolean lb4 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao3.m3();
}
    Thought lo0 = Thought100.getInstance(fb1, fb0, fb1, fb0);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    double ld1 = 126.39974276114765;
    Output.points[1][5] += fd0;
    boolean lb2 = false;
    Output.points[1][6] -= fd1;
    fb0 = fb1 || lb2;
    Thought lo3 = Thought372.getInstance(ao4, fo0, fo1, ao1);
    Output.points[1][7] += ld1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
    fb1 = ld1 < fd0;

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
    Thought lo0 = Thought328.getInstance();
    fb0 = fb1 && fb0;
        fb1 = ad1 > ad2;
    ad3 *= -1;
    Thought lo1 = Thought310.getInstance(fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 + fd1;
        Thought lo2 = Thought271.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
        Thought lo3 = Thought48.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
        boolean lb4 = true;
        ad3 *= -1;
        lb4 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb4, fb0, fb1, lb4);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    Output.points[1][8] -= fd0;
    ab4 = fb0 && fb1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    lb0 = ab1 && ab2;
    double ld1 = 469.4824073298854;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld1);
}
    ab1 = fd0 < fd1;
    double ld4 = 771.5978895923605;
    ld1 = ld4 - fd0;
    fd1 = ld1 + ld4;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ld4);
}
    Output.points[2][0] += fd0;
    fd1 = ld1 - ld4;
    fb0 = fb1 && lb0;

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
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ao2.m1(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
    lb1 = !ab1;
    fd1 = ad1 + ad2;
    ab2 = ab3 && ab4;
    fb0 = ad3 < ad4;
    fb1 = lb0 || lb1;
    ab1 = fd0 > fd1;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo3 = Thought267.getInstance(ad1, ad2, ad3, ad4);
    ab1 = ab2 || ab3;
    fd0 = fd1 + ad1;
    ab4 = fb0 || fb1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[2][1] -= fd1;
    boolean lb4 = true;

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
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
          fo0.m2(fb1, fb0, fb1, fb0);
}
    double ld0 = 905.5127893165628;
    fb1 = fb0 && fb1;
    double ld1 = 616.2952029641469;
    fb0 = ld0 > ld1;
    fd0 = fd1 + ld0;
    ld1 *= -1;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought260.getInstance(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
    ld0 *= -1;
    ld1 = fd0 - fd1;
    fb0 = ld0 < ld1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = ab1 && ab2;
    Output.points[2][2] -= fd0;
    ab3 = !ab4;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought342.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = ab1 || ab2;
    fd0 = fd1 + fd0;

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
    ad2 *= -1;
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        double ld0 = 348.95498395588913;
        fd0 = fd1 - ld0;
        double ld1 = 669.5904939223918;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        ld1 = ad1 + ad2;
        fb1 = !fb0;
if(fo0 != null){
          fo0.m3(ad3, ad4, fd0, fd1);
}
        double ld2 = 561.9778999151766;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    fb0 = fd0 < fd1;
    double ld0 = 429.33834076771933;
    ld0 = ad1 + ad2;
    double ld1 = 194.3717234493955;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fd1 = ld0 - ld1;
    Output.points[2][3] += ad1;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fb0 = ad2 > ad3;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
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
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought333.getInstance(fo1, ao1, ao2, ao3);
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    Output.points[2][4] += fd1;
    Thought lo2 = Thought178.getInstance(fd0, fd1, fd0, fd1);
    boolean lb3 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    Output.points[2][5] += fd1;
    double ld4 = 799.140702023938;
    lb1 = ld4 > fd0;
    double ld5 = 343.47844511994487;
if(fo0 != null){
      ao4 = fo0.m4();
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
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    fb0 = fd1 < ad1;
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    fb1 = fb0 || fb1;
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ad4 = ao2.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
        ad3 = ad4 + fd0;
        fd1 *= -1;
        fb0 = fb1 && lb0;
        boolean lb1 = false;
        lb1 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
}
        boolean lb2 = true;
        double ld3 = 40.666675605119266;
        boolean lb4 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        double ld5 = 766.3033662104798;
        ld3 = ld5 - ad1;
        ad2 *= -1;
        boolean lb6 = true;
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
        ld3 = ld5 + ad1;
        double ld7 = 54.532982094412894;
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
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    boolean lb0 = false;
        Thought lo1 = Thought136.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(lb0, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 898.9822356915828;
        ab4 = fd0 < fd1;
        fb0 = ld2 < fd0;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1, fb1, lb0, ab1, ab2);
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
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought189.getInstance(ao2, ao3, ao4, fo0);
    ab2 = ad3 < ad4;
    ab3 = ab4 || fb0;
    Thought lo2 = Thought243.getInstance(fd0, fd1, ad1, ad2);
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    lb0 = ab1 && ab2;
if(fo0 != null){
      fo0.m1();
}
    boolean lb3 = false;

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
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
        fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld1 = 984.8876409792172;
    fb0 = ld1 > fd0;
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(ld1, fd0, fd1, ld1);
}
    lb2 = lb3 && fb0;
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
    Output.points[2][6] += fd0;
    Thought lo4 = Thought195.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);

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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought22.getInstance();
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld1 = 230.60525480111707;
    double ld2 = 669.5010745163661;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    double ld3 = 60.378702949207536;
        fb1 = ld2 > ld3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2, fb0, fb1, fb0, fb1);
}
    Output.points[2][7] += ld3;
    Output.points[2][8] += fd0;
    fd1 = ld1 - ld2;
    ld3 = fd0 + fd1;
    ld1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    Output.points[3][0] += fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[3][1] += fd1;
    fd0 *= -1;
    fb0 = fd1 > fd0;
    Output.points[3][2] += fd1;
    fb1 = fd0 > fd1;
    Output.points[3][3] -= fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;

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
