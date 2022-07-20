package genetic;
import java.util.ArrayList;
class Thought163 extends Thought{
private static ArrayList<Thought163> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 886.6092696798949;
private double fd1 = 499.07431032059856;
private Thought fo0 = null;
private Thought fo1 = null;
Thought163 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought163 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought163 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought163 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought163 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought163 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought163 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought163 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought163 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought163 instance = new Thought163 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought163 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought163 instance = new Thought163 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought163 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought163 instance = new Thought163 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought163 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought163 instance = new Thought163 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought163 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought163 instance = new Thought163 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought163 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought163 instance = new Thought163 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought163 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought163 instance = new Thought163 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought163 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought163 instance = new Thought163 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 488.9748020414597;
    Thought lo1 = Thought171.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ld0 + fd0;

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
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = fd0 > fd1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        }
    boolean lb0 = false;
    double ld1 = 636.8756109599618;
    ab2 = ab3 || ab4;
    fd0 *= -1;
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld1;
    double ld2 = 276.9995284837672;
    double ld3 = 541.4138589838368;
if(fo1 != null){
      ab3 = fo1.m2(ld2, ld3, fd0, fd1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought31.getInstance(ab4, fb0, fb1, lb0);
    Thought lo5 = Thought244.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, ld3, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m3(fd1, ld1, ld2, ld3, fb0, fb1, lb0, ab1);
}
    double ld6 = 948.2786235935012;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought180.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = true;
    fb0 = ad2 < ad3;
    fb1 = !lb1;
    boolean lb2 = true;
    ad4 *= -1;
    lb2 = fd0 < fd1;
    boolean lb3 = false;
    Thought lo4 = Thought191.getInstance(ad1, ad2, ad3, ad4);
    boolean lb5 = true;
    lb3 = lb5 && fb0;
    boolean lb6 = false;
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
    if (fb1) {
        lb1 = lb2 || lb3;
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
    ab2 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
    ab3 = ab4 || fb0;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought371.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fb1 = fo1.m2(lb1, ab1, ab2, ab3);
}
    double ld2 = 184.29416757777003;
    Output.points[7][0] += ad4;

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
    fb0 = fd1 < fd0;
    Thought lo0 = Thought100.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb1 = false;
        double ld2 = 350.35767717394486;
    Thought lo3 = Thought118.getInstance();
    ld2 = fd0 - fd1;
    ld2 = fd0 - fd1;
if(fo1 != null){
      ld2 = fo1.m3(lb1, fb0, fb1, lb1);
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
    Thought lo0 = Thought167.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fd1 = ad1 + ad2;
    fb1 = !fb0;
    Thought lo1 = Thought190.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 && fb0;
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && lb2;
    double ld3 = 571.2411958305482;
    fb0 = !fb1;
    Output.points[7][1] += fd0;
    lb2 = fb0 || fb1;
if(fo1 != null){
      lb2 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld3, ad1, ad2);
}
    Thought lo4 = Thought128.getInstance();
if(fo0 != null){
      fo0.m1(fb0, fb1, lb2, fb0);
}
    ad3 = ad4 + fd0;
    double ld5 = 355.18725790075297;
    boolean lb6 = false;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ld3, ld5, fb0, fb1, lb2, lb6);
}
    ad1 *= -1;
    Output.points[7][2] -= ad2;
    fb0 = fb1 || lb2;
    ad3 *= -1;
    double ld7 = 445.84214643893114;
    lb6 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb2, lb6, fb0, fb1);
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
    Thought lo0 = Thought125.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    fd0 = fd1 - fd0;
    Output.points[7][3] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = !ab1;
if(fo1 != null){
      fd0 = fo1.m3();
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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    fd1 *= -1;
    boolean lb2 = true;
if(ao2 != null){
      lb2 = ao2.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
        fb0 = fd1 > ad1;
    ad2 = ad3 - ad4;

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
    Thought lo0 = Thought199.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = true;
    lb1 = fd0 < fd1;
    boolean lb3 = false;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb3 = !fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, lb2, lb3);
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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    double ld1 = 808.8569185581913;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;
    fd1 = ld1 - fd0;
    Thought lo4 = Thought344.getInstance(fd1, ld1, fd0, fd1);
    lb2 = lb3 && ab1;
    boolean lb5 = true;
    ld1 = fd0 - fd1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Thought lo6 = Thought22.getInstance();

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
      fo0.m2(fb1, fb0, fb1, fb0);
}
    Output.points[7][4] -= ad2;
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = !fb0;
    Output.points[7][5] -= ad1;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        lb0 = ad2 < ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
        ad2 *= -1;
        ad3 = ad4 - fd0;
        fb0 = !fb1;
        lb0 = fd1 < ad1;
        Thought lo1 = Thought147.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
        fd1 = ad1 + ad2;
        ad3 = ad4 + fd0;
        fb0 = !fb1;
if(fo1 != null){
          lb0 = fo1.m2();
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ad1 < ad2;
    ab4 = !fb0;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[7][6] -= ad1;
if(fo0 != null){
      fo0.m1();
}
    lb0 = ad2 < ad3;
if(fo1 != null){
      lb1 = fo1.m2(lb2, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, lb2, ab1, ab2);
}
    double ld3 = 768.2690576481447;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld4 = 184.8903545002618;
    lb0 = ld3 > ld4;
    lb1 = ad1 > ad2;
    lb2 = ab1 && ab2;
    ab3 = ad3 > ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = !fb0;
    boolean lb0 = false;
if(ao1 != null){
          fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo3 = Thought31.getInstance(lb0, lb1, lb2, fb0);
    fb1 = lb0 && lb1;
    Thought lo4 = Thought390.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
    boolean lb5 = true;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, lb1, lb2, lb5, fb0);
}
    fb1 = lb0 && lb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, lb5, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad2 = ao3.m3(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought56.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
    Thought lo2 = Thought54.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
        fd0 *= -1;
    Thought lo3 = Thought320.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
    fb0 = fd1 < ad1;
    Output.points[7][7] -= ad2;
    fb1 = lb0 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought308.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    double ld1 = 823.1534718887374;
    ab2 = !ab3;
    Thought lo2 = Thought199.getInstance();
    boolean lb3 = true;
    Output.points[7][8] -= ld1;
    double ld4 = 312.65982224264025;
    Output.points[8][0] -= ld4;
    ab3 = !ab4;
    boolean lb5 = false;
    Thought lo6 = Thought290.getInstance(ab4, fb0, fb1, lb3);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld4, lb5, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao4 != null){
      lb3 = ao4.m2(fd0, fd1, ld1, ld4, lb5, ab1, ab2, ab3);
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
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = lb1 && ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld2 = 717.2830342166455;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Output.points[8][1] += ld2;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fb1 = lb0 || lb1;
    Thought lo3 = Thought110.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1);
    Output.points[8][2] -= ad2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb4 = false;
    ad3 = ad4 + fd0;
    boolean lb5 = true;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[8][3] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought311.getInstance(fd1, fd0, fd1, fd0);

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
    lb0 = fd1 < fd0;
    Thought lo1 = Thought153.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Output.points[8][4] += fd1;
if(fo0 != null){
      ab1 = fo0.m2();
}
    double ld2 = 237.5920161335626;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
    ld2 = fd0 - fd1;
    fb0 = ld2 > fd0;
    fb1 = !lb0;
    double ld4 = 475.1313828702517;

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
    Output.points[8][5] += ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        fb1 = ad1 > ad2;
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        fb1 = ad3 > ad4;
        fb0 = fb1 && fb0;
        double ld0 = 378.57162795669365;
        fb1 = fb0 && fb1;
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
        fb0 = ad2 > ad3;
        Thought lo1 = Thought140.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
        fb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld0, ad1);
}
        }
    double ld2 = 534.7823973436764;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd1 < ld2;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
        fb0 = fd0 < fd1;
    fb1 = ad1 > ad2;
    ab1 = !ab2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = fd0 < fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 || lb0;
    lb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      lb0 = ao2.m2(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + fd0;
    Output.points[8][6] -= fd1;
    double ld2 = 14.041173410454405;
    ld2 = fd0 + fd1;
if(ao2 != null){
      ld2 = ao2.m3(fd0, fd1, ld2, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
    double ld3 = 832.2185542982539;
    lb1 = !fb0;
    if (fb1) {
}
Thought.STACK_COUNTER++;
return ld2;
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
    Thought lo0 = Thought39.getInstance();
    boolean lb1 = false;
    boolean lb2 = true;
if(ao1 != null){
      ad2 = ao1.m3(lb2, fb0, fb1, lb1);
}
    boolean lb3 = true;
    Output.points[8][7] += ad3;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb1);
}
    ad2 = ad3 + ad4;
    Thought lo4 = Thought229.getInstance(fd0, fd1, ad1, ad2, lb2, lb3, fb0, fb1);
    ad3 = ad4 + fd0;
    lb1 = fd1 < ad1;
    lb2 = lb3 || fb0;
    fb1 = !lb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, lb3, fb0, fb1);
}
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad2 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    ab1 = !ab2;
    Thought lo1 = Thought24.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought347.getInstance();
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    boolean lb3 = false;
    Output.points[8][8] -= fd1;
    boolean lb4 = true;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb4, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    double ld5 = 476.02096249201554;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ld5 = fd0 + fd1;
if(ao3 != null){
      ao3.m2(ld5, fd0, fd1, ld5);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld5, fd0);
}
    boolean lb6 = true;
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb0 = !lb3;
if(fo1 != null){
      lb4 = fo1.m2(lb6, ab1, ab2, ab3);
}
    double ld7 = 330.3142473646035;

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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 740.441230256505;
    Output.points[0][0] += fd0;
    fd1 = ld2 + ad1;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, lb0, lb1, ab1, ab2);
}
    ab3 = fd1 > ld2;
    boolean lb3 = true;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    lb1 = !lb3;
    ab1 = ad1 < ad2;
    Output.points[0][1] -= ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ld2);
}
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
if(fo1 != null){
      fo1.m1();
}
    ab2 = ab3 && ab4;
    double ld4 = 791.3004505972087;
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1, ld4, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    double ld5 = 842.5381931206846;

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
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    double ld1 = 814.2965657668301;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought107.getInstance();
    Thought lo3 = Thought352.getInstance(fb1, lb0, fb0, fb1);
    boolean lb4 = true;
    boolean lb5 = false;
    fd0 *= -1;
    Thought lo6 = Thought27.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, lb0, lb4, lb5, fb0);
    Output.points[0][2] -= ld1;
    fd0 *= -1;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1, fb1, lb0, lb4, lb5);
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
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought269.getInstance(fd0, fd1, fd0, fd1);
        Output.points[0][3] -= fd0;
        boolean lb1 = true;
        fb0 = !fb1;
        Thought lo2 = Thought280.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
        fd1 = fd0 - fd1;
        lb1 = !ab1;
if(fo0 != null){
          ab2 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[0][4] -= fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
        lb0 = ad2 < ad3;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    if (fb0) {
        fb1 = fd1 > ad1;
        boolean lb2 = true;
        lb2 = ad2 < ad3;
        boolean lb3 = false;
        ad4 = fd0 - fd1;
        lb3 = ad1 > ad2;
        lb0 = ad3 < ad4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        Thought lo4 = Thought151.getInstance();
        ad3 *= -1;
        lb1 = fb0 && fb1;
        Thought lo5 = Thought39.getInstance(lb2, lb3, lb0, lb1);
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
    Thought lo0 = Thought76.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    Output.points[0][5] += fd0;
    boolean lb1 = false;
    boolean lb2 = false;
    fd1 = ad1 + ad2;
        double ld3 = 926.4070555985846;
    ad2 *= -1;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, ad1);
}
    fb0 = ad2 > ad3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3);
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
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    Thought lo1 = Thought300.getInstance();
    double ld2 = 465.4710314083955;
    fd0 *= -1;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fd1 = ld2 - fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ld2, fd0, fd1, ld2, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    Output.points[0][6] -= fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[0][7] -= fd1;
    Thought lo3 = Thought45.getInstance(ld2, fd0, fd1, ld2);
    boolean lb4 = true;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
        }
        boolean lb5 = false;
    lb5 = ld2 < fd0;
    fd1 = ld2 + fd0;

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
if(ao1 != null){
      ad1 = ao1.m3();
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    fb1 = ad3 > ad4;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    ad3 = ad4 - fd0;
    double ld1 = 264.18147409831687;
    boolean lb2 = true;
    Thought lo3 = Thought315.getInstance(fd0, fd1, ld1, ad1, lb2, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb0);
}
    boolean lb4 = false;
    boolean lb5 = false;
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
    ab2 = ab3 || ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    double ld0 = 270.8695646461575;
    Output.points[0][8] += ld0;
    Thought lo1 = Thought169.getInstance(fb0, fb1, ab1, ab2);
    Thought lo2 = Thought369.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
    fd1 = ld0 + fd0;
    Thought lo3 = Thought73.getInstance(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    ld0 *= -1;
    ab1 = fd0 > fd1;
    ld0 = fd0 + fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad2 = ad3 + ad4;
    ab3 = ab4 && fb0;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought88.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m2(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    ab2 = !ab3;
    boolean lb2 = true;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, lb2, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1);
}
        boolean lb3 = false;
        ad3 *= -1;
if(ao2 != null){
          ao2.m3(ad4, fd0, fd1, ad1);
}
        Output.points[1][0] += ad2;
        ab2 = ad3 > ad4;
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    Output.points[1][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    double ld0 = 950.7358304374665;
    double ld1 = 327.7654847291697;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    ld1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fb0 = ld0 < ld1;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb0 = fd1 < fd0;
        fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought393.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;
        fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo1 = Thought353.getInstance();
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
        Thought lo0 = Thought250.getInstance();
    Thought lo1 = Thought323.getInstance(fb1, fb0, fb1, fb0);
    fd1 *= -1;
        boolean lb2 = false;
    boolean lb3 = true;
    Output.points[1][2] += fd0;
    lb3 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb3);
}
    boolean lb4 = false;
    fd1 *= -1;
if(fo1 != null){
      lb4 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);
}
    boolean lb5 = false;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb4 = lb5 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, lb4, lb5);
}
    Output.points[1][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo6 = Thought111.getInstance();

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
