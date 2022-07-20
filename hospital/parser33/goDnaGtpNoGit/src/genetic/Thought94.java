package genetic;
import java.util.ArrayList;
class Thought94 extends Thought{
private static ArrayList<Thought94> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 471.2768219997624;
private double fd1 = 588.455452065108;
private Thought fo0 = null;
private Thought fo1 = null;
Thought94 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought94 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought94 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought94 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought94 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought94 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought94 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought94 instance = new Thought94 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    double ld0 = 639.2806681221838;
    double ld1 = 976.8365800181989;
    fb1 = fb0 || fb1;
    fb0 = ld1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
    boolean lb2 = true;
    lb2 = fd1 < ld0;
    fb0 = ld1 > fd0;
    boolean lb3 = false;
    Thought lo4 = Thought307.getInstance();
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      lb2 = fo1.m2(lb3, fb0, fb1, lb2);
}
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb0, fb1, lb2, lb3);
}
    Thought lo5 = Thought328.getInstance(ld0, ld1, fd0, fd1, fb0, fb1, lb2, lb3);
    ld0 *= -1;
    boolean lb6 = true;
    lb6 = ld1 < fd0;

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
    Output.points[7][3] -= fd1;
    double ld0 = 768.9761539170732;
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    ld0 = fd0 - fd1;
    Output.points[7][4] -= ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    ab1 = fd1 > ld0;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld0;
    Thought lo2 = Thought334.getInstance(fd0, fd1, ld0, fd0);
    boolean lb3 = true;
    Thought lo4 = Thought125.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo0 != null){
      lb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(lb3, ab1, ab2, ab3);
}
    double ld5 = 682.5627941809126;
    ab4 = ld0 > ld5;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld5, fb1, lb1, lb3, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld5, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb3, ab1);
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
    fb1 = !fb0;
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    double ld1 = 38.649920855025236;
    ad3 = ad4 + fd0;
    boolean lb2 = true;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ld1 = ad1 - ad2;
    Thought lo3 = Thought386.getInstance(ad3, ad4, fd0, fd1);
    ld1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb0 = lb2 || fb0;
if(fo0 != null){
      ld1 = fo0.m3();
}
    fb1 = ad1 > ad2;

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
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = lb1 && ab1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
    fb0 = !fb1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought90.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[7][5] += fd1;

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
    Thought lo0 = Thought193.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Output.points[7][6] -= ad1;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
    Output.points[7][7] -= ad4;
    double ld1 = 655.4210817975866;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought97.getInstance(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
    ad4 *= -1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    double ld1 = 394.53748938480845;
    fd0 *= -1;
    fb1 = fd1 < ld1;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, lb0, lb2, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, lb0, lb2, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb3 = true;
    double ld4 = 111.17579646050085;
    ab2 = ld4 > fd0;
    fd1 *= -1;
        ab3 = ab4 && fb0;
    fb1 = lb0 || lb2;
if(ao1 != null){
      fo1 = ao1.m4(ld1, ld4, fd0, fd1);
}
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, ld4, fd0, fd1, ld1);
}
    ld4 = fd0 + fd1;
    ld1 = ld4 + fd0;
    Output.points[7][8] -= fd1;
    lb3 = ab1 && ab2;
    ld1 = ld4 + fd0;
    ab3 = ab4 || fb0;

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
    Output.points[8][0] -= ad4;
    ab2 = fd0 < fd1;
    Output.points[8][1] += ad1;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = ad2 < ad3;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao4 != null){
      ab3 = ao4.m2();
}
    if (ab4) {
        ad1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, ab1);
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought115.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    boolean lb3 = false;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo4 = Thought304.getInstance();
    Thought lo5 = Thought271.getInstance(lb1, lb3, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab3 = fd0 < fd1;
    fd0 = fd1 + fd0;
    double ld0 = 315.0218030649127;
    Thought lo1 = Thought69.getInstance();
    boolean lb2 = true;
    ab3 = !ab4;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb2);
}
    fd0 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought248.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 = fd1 - ad1;
    boolean lb1 = false;
    Thought lo2 = Thought215.getInstance(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
    fb0 = fd1 > ad1;
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    ad2 *= -1;
    fb1 = ad3 > ad4;
    lb1 = fb0 && fb1;
        lb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = fd0 > fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        Thought lo3 = Thought65.getInstance();
    Thought lo4 = Thought157.getInstance(fb0, fb1, lb1, fb0);
    fb1 = lb1 && fb0;
    fb1 = lb1 || fb0;
    fb1 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
    Thought lo5 = Thought357.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
        boolean lb6 = true;

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
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld0 = 550.8519746844651;
    Thought lo1 = Thought112.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ad3 < ad4;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
    ab1 = ab2 && ab3;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab3 = fd0 < fd1;
    Thought lo3 = Thought332.getInstance();
        ab4 = fb0 && fb1;
if(fo0 != null){
      lb2 = fo0.m2(ab1, ab2, ab3, ab4);
}
    double ld4 = 651.8141510291732;
    Thought lo5 = Thought98.getInstance(fo1, fo0, fo1, fo0, ld0, ld4, ad1, ad2, fb0, fb1, lb2, ab1);
    ab2 = !ab3;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld4, ad1, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
    boolean lb6 = false;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return lb6;
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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    Thought lo2 = Thought104.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld0 = 318.7189186521677;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo1 = Thought294.getInstance();

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
    boolean lb0 = true;
    boolean lb1 = true;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(lb0, lb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Thought lo2 = Thought6.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
        double ld3 = 767.2297858810718;
        ab3 = ld3 > fd0;
        ab4 = fb0 && fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb1, ab1, ab2);
}
        ab3 = fd1 < ld3;
        fd0 *= -1;
        Output.points[8][2] += fd1;
        boolean lb4 = false;
        ab3 = ab4 || fb0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
    ab1 = ab2 && ab3;
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    Output.points[8][3] -= ad4;
if(fo1 != null){
          fo1.m3(fd0, fd1, ad1, ad2);
}
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4();
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought27.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    double ld1 = 533.5549995906143;
    for(int i0=0; i0<10; i0++){
        double ld2 = 386.3961126497476;
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
        Output.points[8][4] -= ld1;
        fd0 = fd1 - ld2;
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        double ld3 = 74.45657931199447;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo4 = Thought374.getInstance(ld1, fd0, fd1, ld2);
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld3, ld1, fd0, fd1);
}
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m1();
}
    fb1 = fd1 < fd0;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
    double ld0 = 438.5201517280162;
    double ld1 = 463.1098070451218;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = ld1 < fd0;
    Thought lo2 = Thought232.getInstance(fo1, fo0, fo1, fo0);
    double ld3 = 408.9224976261065;
    Thought lo4 = Thought74.getInstance(fd0, fd1, ld0, ld1);
    ld3 = fd0 - fd1;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    boolean lb1 = false;
    double ld2 = 217.6361628053112;
if(fo0 != null){
      fd0 = fo0.m3();
}
    lb1 = fd1 < ld2;
    double ld3 = 479.5610705546284;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    Output.points[8][5] += fd0;
    fd1 = ld2 + ld3;
    Output.points[8][6] += ad1;

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
    Thought lo0 = Thought34.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought113.getInstance(fo0, fo1, fo0, fo1);
    ab3 = fd0 < fd1;
    ab4 = fb0 && fb1;
    ab1 = ad1 < ad2;
    ad3 *= -1;
    ab2 = ad4 > fd0;
    fd1 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        boolean lb2 = true;
        ab2 = ab3 && ab4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 993.8213205350363;
    fb1 = !fb0;
    fb1 = !fb0;
    fd0 = fd1 + ld0;
    Output.points[8][7] += fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld1 = 928.9918900603544;
    Thought lo2 = Thought133.getInstance(fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
        Thought lo3 = Thought135.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        Output.points[8][8] += fd1;
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        ld0 = ld1 + fd0;
        Thought lo4 = Thought32.getInstance(ao3, ao4, fo0, fo1);
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
    boolean lb0 = true;
        fb0 = ad1 < ad2;
    Output.points[0][0] -= ad3;
    fb1 = ad4 > fd0;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      lb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
    Output.points[0][1] += fd0;
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought219.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought289.getInstance();
    boolean lb3 = true;
    double ld4 = 491.8864720514066;
if(fo1 != null){
      fo1.m2(lb0, lb3, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ld4 < fd0;
    fd1 *= -1;
    lb0 = lb3 && ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld4, fd0, fd1, ld4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld4;
    fd0 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(fd1, ld4, fd0, fd1, lb0, lb3, ab1, ab2);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ld4 = fd0 + fd1;
    double ld5 = 137.7681917535084;
    Thought lo6 = Thought316.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m1(ld4, ld5, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld4, ld5, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought369.getInstance();
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    Thought lo1 = Thought152.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
    fb0 = fb1 && ab1;
    Thought lo2 = Thought242.getInstance(ao1, ao2, ao3, ao4);
    double ld3 = 310.9905923774338;

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
    Thought lo0 = Thought121.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought286.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
    Output.points[0][2] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;

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
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    ab3 = fd0 > fd1;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    double ld0 = 304.20615047781126;
        double ld1 = 408.59495720320865;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
    ab1 = ld0 > ld1;
    boolean lb2 = true;
    Output.points[0][3] += fd0;
    fd1 = ld0 - ld1;
    boolean lb3 = true;
    double ld4 = 951.9473795778396;
    double ld5 = 465.8337035553545;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb3 = fo1.m2(ab1, ab2, ab3, ab4);
}
    ld4 = ld5 + fd0;
    double ld6 = 628.8953559428247;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb0, fb1, lb2, lb3);
}
    Output.points[0][4] += ld4;
if(fo0 != null){
      fo1 = fo0.m4(ld5, ld6, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ld0 *= -1;
    lb2 = !lb3;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
if(fo1 != null){
      ad3 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 141.04267506231355;
    Thought lo2 = Thought127.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    double ld3 = 772.6444957263028;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 < fd0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    lb0 = ab1 || ab2;
        ab3 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    if (ab3) {
        Thought lo2 = Thought388.getInstance();
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
        lb3 = lb0 || lb1;
        } else if (ab2) {
        boolean lb4 = false;
        fd1 = ad1 - ad2;
        ad3 *= -1;
        Output.points[0][5] -= ad4;
        Output.points[0][6] -= fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb1, lb4, lb0, lb1);
}
        boolean lb5 = false;
        boolean lb6 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
}
        ab3 = !ab4;
        fb0 = ad4 < fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ad1 = ad2 + ad3;
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ad1, ad2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought212.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought148.getInstance();
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - fd0;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb2, fb0, fb1);
}
        Output.points[0][7] -= fd1;
        fd0 *= -1;
        boolean lb3 = false;
        lb2 = fd1 < fd0;
        boolean lb4 = true;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        boolean lb5 = true;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        lb3 = !lb4;
if(ao1 != null){
          fo1 = ao1.m4();
}
        lb5 = fb0 && fb1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 828.4591780953984;
if(ao1 != null){
          fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
        double ld1 = 887.295726200822;
    Output.points[0][8] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought40.getInstance(ao3, ao4, fo0, fo1);
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fd1 > ld0;
    double ld3 = 818.5312116421204;
    boolean lb4 = true;
if(ao1 != null){
      ao1.m1(ld1, ld3, ad1, ad2);
}
    fb0 = ad3 > ad4;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought214.getInstance();
    Output.points[1][0] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought195.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        boolean lb2 = true;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        fd1 = fd0 + fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    double ld0 = 444.3106730489478;
    Output.points[1][1] -= ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought37.getInstance();
    Thought lo2 = Thought237.getInstance(ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
    Thought lo3 = Thought384.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
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
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought84.getInstance(fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 82.46367348307419;
    fb0 = fd0 > fd1;
    double ld2 = 54.09889119158778;
if(fo0 != null){
      fb1 = fo0.m2(ld1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld1 = ld2 - fd0;
    fd1 = ld1 - ld2;
    fb0 = fb1 || fb0;

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
        Thought lo0 = Thought348.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought48.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    lb1 = fd0 > fd1;
    Thought lo3 = Thought71.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Thought lo4 = Thought349.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
    Output.points[1][2] -= fd1;
    double ld5 = 935.3184179084426;

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
    Output.points[1][3] += fd0;
    Thought lo0 = Thought6.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    Output.points[1][4] += fd0;
    lb1 = fd1 < fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[1][5] += fd0;
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    fd1 = fd0 - fd1;

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
