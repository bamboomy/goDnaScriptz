package genetic;
import java.util.ArrayList;
class Thought319 extends Thought{
private static ArrayList<Thought319> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 723.6697479629639;
private double fd1 = 725.7656485850371;
private Thought fo0 = null;
private Thought fo1 = null;
Thought319 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought319 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought319 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought319 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought319 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought319 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought319 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought319 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought319 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought319 instance = new Thought319 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought319 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought319 instance = new Thought319 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought319 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought319 instance = new Thought319 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought319 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought319 instance = new Thought319 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought319 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought319 instance = new Thought319 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought319 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought319 instance = new Thought319 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought319 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought319 instance = new Thought319 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought319 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought319 instance = new Thought319 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought115.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld1 = 879.1706572072571;
    fb1 = ld1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld1, fd0, fd1);
}
    fb0 = !fb1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    double ld0 = 785.6766872167158;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    fd1 *= -1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 && fb0;
    fb1 = ld0 < fd0;
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1);
}
    boolean lb1 = false;
    Thought lo2 = Thought279.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2();
}
    Output.points[0][7] -= fd0;
if(fo0 != null){
      lb1 = fo0.m2(lb3, ab1, ab2, ab3);
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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        lb0 = fb0 && fb1;
if(fo0 != null){
          fo0.m3(ad1, ad2, ad3, ad4, lb1, lb0, fb0, fb1);
}
        lb1 = fd0 > fd1;
        lb0 = ad1 > ad2;
        fb0 = fb1 || lb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought81.getInstance(ad1, ad2, ad3, ad4);
    ab2 = fd0 > fd1;
    boolean lb1 = false;
    ab2 = ab3 || ab4;
    fb0 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo1.m3();
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      lb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;
    Thought lo3 = Thought109.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
    ab1 = ad4 > fd0;
    boolean lb4 = false;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    double ld5 = 156.13720393517985;

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
    Output.points[0][8] += fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    double ld1 = 85.3921083060216;
    ld1 = fd0 + fd1;
    Thought lo2 = Thought82.getInstance(ld1, fd0, fd1, ld1);
    Output.points[1][0] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
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
if(ao1 != null){
      ao1.m1();
}
    ad2 *= -1;
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = ad1 < ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    lb1 = fb0 || fb1;

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
if(ao2 != null){
      fd0 = ao2.m3();
}
    lb0 = ab1 && ab2;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    lb1 = !ab1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[1][1] += fd1;

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
    boolean lb0 = false;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 > ad1;
    ad2 *= -1;
    ab2 = ad3 > ad4;
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
    double ld1 = 49.90795694942582;
    Thought lo2 = Thought178.getInstance(ld1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    boolean lb3 = false;
    Thought lo4 = Thought28.getInstance();
    ld1 = ad1 - ad2;
    if (lb3) {
        boolean lb5 = false;
if(fo0 != null){
          fo0.m3(lb3, ab1, ab2, ab3);
}
if(fo1 != null){
          ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, ab4, fb0, fb1, lb5);
}
        boolean lb6 = true;
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
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought66.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;

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
    boolean lb0 = true;
    Output.points[1][2] += fd0;
    fd1 = fd0 - fd1;
    lb0 = !ab1;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, lb0);
}
    Output.points[1][3] += fd1;
    double ld1 = 897.8843074817883;
    ab1 = ld1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][4] -= ad2;
    fb0 = !fb1;
    ad3 *= -1;
    Thought lo0 = Thought54.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    lb1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    fd1 = ad1 - ad2;
    if (lb2) {
        ad3 = ad4 - fd0;
        Thought lo3 = Thought329.getInstance(fd1, ad1, ad2, ad3);
        Thought lo4 = Thought204.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
        fb0 = fb1 || lb1;
        Output.points[1][5] += ad2;
        ad3 *= -1;
        boolean lb5 = true;
if(fo1 != null){
          lb1 = fo1.m2();
}
        Output.points[1][6] -= ad4;
        Output.points[1][7] -= fd0;
        fd1 = ad1 + ad2;
        ad3 *= -1;
        ad4 *= -1;
        double ld6 = 590.7075303445082;
        double ld7 = 244.9925084770792;
        lb2 = !fb0;
        boolean lb8 = true;
        Output.points[1][8] += ad3;
        fb0 = fb1 && lb5;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Thought lo0 = Thought265.getInstance(ab2, ab3, ab4, fb0);
    ad1 = ad2 + ad3;
    fb1 = ab1 && ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ab2 = ad2 > ad3;
    Thought lo1 = Thought42.getInstance(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    Thought lo2 = Thought65.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    Thought lo3 = Thought267.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb4 = true;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    fd0 *= -1;
    lb4 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[2][0] += ad2;
    Output.points[2][1] -= ad3;

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
    boolean lb0 = true;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2(lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    double ld2 = 660.7129022293209;
    fd0 *= -1;
    boolean lb3 = true;
if(ao3 != null){
      ao3.m1(fd1, ld2, fd0, fd1, lb0, lb1, lb3, fb0);
}
    ld2 = fd0 - fd1;
    ld2 = fd0 + fd1;

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
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    fd0 *= -1;
    fb0 = fb1 && lb0;
    Output.points[2][2] -= fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
    Thought lo1 = Thought27.getInstance(lb0, fb0, fb1, lb0);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    ad4 = fd0 - fd1;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    double ld2 = 263.9766026622428;
    lb0 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb3 = false;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld2, ad1);
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb4 = false;
    double ld5 = 132.23820655300156;
if(ao2 != null){
      lb3 = ao2.m2();
}
    lb4 = fd0 < fd1;
if(ao3 != null){
      ao3.m1(fb0, fb1, lb0, lb3);
}
    Thought lo6 = Thought174.getInstance(ao4, fo0, fo1, ao1, ld2, ld5, ad1, ad2, lb4, fb0, fb1, lb0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 *= -1;
    ab2 = fd0 < fd1;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        double ld0 = 28.477844474799163;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Output.points[2][3] += ld0;
        fb1 = fd0 > fd1;
        ld0 = fd0 - fd1;
        ld0 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 371.50982330333227;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
}
    ab2 = !ab3;
    ad2 *= -1;
if(ao4 != null){
      ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    double ld1 = 172.10986174816705;
    ab2 = ab3 || ab4;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ld1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[2][4] -= ad3;
    ab1 = ad4 < fd0;
    double ld2 = 250.3389136014566;
    ab2 = fd0 > fd1;
    Thought lo3 = Thought86.getInstance(ld0, ld1, ld2, ad1);
    Thought lo4 = Thought40.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
if(fo0 != null){
          ao4 = fo0.m4();
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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought255.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);

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
        boolean lb0 = true;
    fd1 *= -1;
    ab1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought302.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab3 = !ab4;
    if (fb0) {
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
    Thought lo0 = Thought278.getInstance();
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 740.356492447158;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = ld1 < ad1;
    ad2 *= -1;
    Thought lo2 = Thought60.getInstance(fo1, fo0, fo1, fo0);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    ad3 *= -1;
    ab2 = ab3 || ab4;
    Output.points[2][5] -= ad4;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 443.62832258574275;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;

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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = !fb0;
    fb1 = fd1 > fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb0;
        fb0 = fb1 && lb0;
        double ld1 = 82.61055638339863;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[2][6] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
        ad1 = ad2 + ad3;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
        fb1 = ad4 > fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Output.points[2][7] -= fd1;
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
        Thought lo1 = Thought306.getInstance();
        lb0 = fb0 && fb1;
        }
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
    Thought lo2 = Thought181.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
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
    Output.points[2][8] += fd0;
    if (ab2) {
        double ld0 = 500.0282264286325;
        fd0 = fd1 + ld0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        boolean lb1 = true;
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, ld0, fd0, fd1);
}
        double ld2 = 24.456617341326577;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld2, fd0, fd1);
}
        Thought lo3 = Thought369.getInstance();
        ld0 = ld2 - fd0;
        ab1 = fd1 > ld0;
        ld2 = fd0 + fd1;
if(ao2 != null){
          ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
        Thought lo4 = Thought293.getInstance(ao3, ao4, fo0, fo1, ld0, ld2, fd0, fd1, lb1, ab1, ab2, ab3);
        Thought lo5 = Thought385.getInstance(ld0, ld2, fd0, fd1, ab4, fb0, fb1, lb1);
        ab1 = ld0 > ld2;
        boolean lb6 = false;
        ab1 = ab2 || ab3;
        boolean lb7 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
        } else if (ab1) {
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
    Output.points[3][0] += ad1;
    double ld0 = 601.5911187769311;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought211.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = ad2 < ad3;
    double ld2 = 578.6030525639997;
    double ld3 = 742.6057322391481;
    Thought lo4 = Thought228.getInstance(fb1, ab1, ab2, ab3);
    Thought lo5 = Thought295.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);

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
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought339.getInstance(fd1, fd0, fd1, fd0);
    fb1 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought15.getInstance();
    boolean lb3 = true;
    lb1 = fd0 < fd1;
    lb3 = fd0 > fd1;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(lb4, fb0, fb1, lb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Output.points[3][1] -= fd0;
    ab2 = !ab3;
    ab4 = fd1 > fd0;
    boolean lb0 = true;
    ab4 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
    Thought lo1 = Thought115.getInstance();
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[3][2] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;

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
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought14.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ad1 < ad2;
    ad3 *= -1;
    Thought lo1 = Thought96.getInstance(ad4, fd0, fd1, ad1);
    double ld2 = 713.6181946721866;
    ad1 = ad2 - ad3;
        double ld3 = 317.99897305257156;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld2, ld3, fb0, fb1, fb0, fb1);
}
    Output.points[3][3] -= ad1;

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
    boolean lb0 = true;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 - fd0;
    if (ab4) {
        Output.points[3][4] -= fd1;
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4);
}
        double ld1 = 231.48406131782937;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
        fb0 = fb1 && lb0;
        Output.points[3][5] -= ad1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab1 = ab2 || ab3;
        Thought lo2 = Thought50.getInstance(ab4, fb0, fb1, lb0);
        fd0 = fd1 - ld1;
        Output.points[3][6] -= ad1;
        boolean lb3 = false;
        lb0 = ab1 || ab2;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb4 = false;
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
    fd0 *= -1;
    double ld0 = 528.7800013435465;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        boolean lb1 = false;
        }
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld0 = ao2.m3(fd0, fd1, ld0, fd0);
}
    fb1 = fd1 > ld0;
    Thought lo2 = Thought380.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb0 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
if(ao4 != null){
      ao4.m1(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    lb0 = !lb1;
    boolean lb3 = true;
    lb2 = ad3 < ad4;
    fd0 *= -1;
    lb3 = !fb0;
    Thought lo4 = Thought39.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
if(ao3 != null){
      ao3.m2(ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb0);
}
    lb1 = ad2 > ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, lb3, fb0, fb1);
}
    lb0 = lb1 || lb2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 527.7884507950229;
    ab2 = ab3 && ab4;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    Output.points[3][7] += fd0;
    fd1 *= -1;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m2();
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao3.m1(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ab2 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought356.getInstance(fd1, ad1, ad2, ad3);
    double ld1 = 583.745098620498;
    ab2 = !ab3;
    ab4 = ad3 < ad4;
    fb0 = fb1 && ab1;
    fd0 = fd1 - ld1;
    ad1 = ad2 + ad3;
    ab2 = !ab3;
    double ld2 = 642.4419650749978;
    Thought lo3 = Thought307.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
if(ao4 != null){
      ld1 = ao4.m3();
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb5 = false;
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
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought328.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;

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
      fb1 = fo0.m2();
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought158.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought123.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    fb0 = fb1 || lb2;
    fb0 = fb1 || lb2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought119.getInstance(fb0, fb1, lb2, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
    fb0 = fd1 > fd0;
    fb1 = lb2 || fb0;
    fb1 = lb2 && fb0;

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
    double ld0 = 229.99431335544998;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = false;
    fd0 = fd1 + ld0;
    Thought lo2 = Thought279.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
    fb0 = !fb1;
        Output.points[3][8] += fd1;
    Output.points[4][0] -= ld0;
    lb1 = fb0 && fb1;
    lb1 = !fb0;
    Output.points[4][1] += fd0;
    fb1 = !lb1;
    fb0 = fd1 > ld0;
    double ld3 = 301.90150392418565;
    ld3 = fd0 + fd1;
    boolean lb4 = true;
    fb0 = ld0 < ld3;

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
