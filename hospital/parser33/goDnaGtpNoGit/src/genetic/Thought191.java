package genetic;
import java.util.ArrayList;
class Thought191 extends Thought{
private static ArrayList<Thought191> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 177.203636287201;
private double fd1 = 164.76471319122697;
private Thought fo0 = null;
private Thought fo1 = null;
Thought191 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought191 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought191 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought191 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought191 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought191 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought191 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought191 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought191 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought191 instance = new Thought191 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought191 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought191 instance = new Thought191 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought191 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought191 instance = new Thought191 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought191 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought191 instance = new Thought191 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought191 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought191 instance = new Thought191 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought191 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought191 instance = new Thought191 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought191 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought191 instance = new Thought191 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought191 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought191 instance = new Thought191 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 && fb1;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        boolean lb1 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > fd0;

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
    Output.points[7][5] -= fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[7][6] -= fd0;
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    if (ab2) {
        Thought lo0 = Thought16.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        ab3 = fd0 > fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
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
    fb1 = ad2 < ad3;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1();
}
    if (lb0) {
        fb0 = ad4 > fd0;
        fd1 = ad1 + ad2;
        } else {
        ad3 = ad4 + fd0;
                fd1 = ad1 - ad2;
if(fo0 != null){
          fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
        ad3 = ad4 + fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        double ld1 = 998.6746893828655;
if(fo0 != null){
          fo0.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fb1 = ad1 > ad2;
        lb0 = !fb0;
        boolean lb2 = true;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        ld1 = ad1 - ad2;
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
    ad2 = ad3 - ad4;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    double ld0 = 924.4120641616029;
    boolean lb1 = false;
    boolean lb2 = false;
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb1, lb1, lb2, ab1);
}
    double ld3 = 201.13013357080868;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ld3 > ad1;
    boolean lb4 = false;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb5 = true;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
        Thought lo0 = Thought244.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    Output.points[7][7] += fd0;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    lb1 = !fb0;
if(ao1 != null){
      fd1 = ao1.m3(fb1, lb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    if (lb1) {
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
        if (lb1) {
}}
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
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    if (fb1) {
        fb0 = ad3 > ad4;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m1(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
        fb0 = fb1 && lb0;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          lb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
        ad4 = fd0 + fd1;
        Output.points[7][8] -= ad1;
        Output.points[8][0] -= ad2;
        fb0 = fb1 || lb0;
        Thought lo1 = Thought269.getInstance(ad3, ad4, fd0, fd1);
        ad1 *= -1;
        fb0 = fb1 && lb0;
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    ab1 = !ab2;
    ab3 = fd1 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    boolean lb0 = true;
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
    boolean lb1 = false;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    double ld2 = 328.57201431398346;
    Thought lo3 = Thought317.getInstance(fd0, fd1, ld2, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
    Thought lo4 = Thought123.getInstance();
if(ao2 != null){
      ld2 = ao2.m3(lb0, lb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld2, fd0, fd1, lb0, lb1, ab1, ab2);
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
    ab1 = !ab2;
    ab3 = !ab4;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab3 = ab4 || fb0;
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought274.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m1();
}
    Thought lo1 = Thought254.getInstance(fb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    ab1 = ab2 || ab3;
    Output.points[8][1] -= fd1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    double ld1 = 706.728051473677;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = !lb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    fb0 = ld1 > fd0;
    fd1 *= -1;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    boolean lb2 = true;
    Thought lo3 = Thought234.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;
    fb1 = lb0 || lb2;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo4 = Thought243.getInstance(fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
        fb0 = !fb1;

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
    double ld0 = 989.4756170207525;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld1 = 631.7919829130435;
    fb1 = ld0 > ld1;
    ab1 = ab2 && ab3;
    boolean lb2 = false;
    ab3 = ab4 || fb0;
    Thought lo3 = Thought34.getInstance(fo0, fo1, fo0, fo1);
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
    fd0 *= -1;

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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = ad1 > ad2;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        fb0 = fb1 && lb0;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
        boolean lb2 = false;
        Output.points[8][2] += ad4;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              ad4 = fo0.m3(fd0, fd1, ad1, ad2, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
              ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
            lb1 = lb2 || ab1;
            ad3 *= -1;
            ad4 = fd0 + fd1;
            ab2 = ad1 < ad2;
            ad3 = ad4 - fd0;
            boolean lb3 = false;
            boolean lb4 = true;
            ab1 = ab2 || ab3;
if(fo0 != null){
              ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
}}
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
    boolean lb0 = false;
    boolean lb1 = false;
    double ld2 = 243.45253299308547;
    lb1 = !fb0;
    boolean lb3 = true;
    fd0 = fd1 + ld2;
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld2, fd0, fd1);
}
    ld2 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2);
}
    Thought lo4 = Thought374.getInstance();
    Thought lo5 = Thought203.getInstance(fb0, fb1, lb0, lb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, lb3, fb0, fb1, lb0);
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
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    fb1 = fb0 || fb1;
    double ld0 = 343.59737286140177;
    fb0 = !fb1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    Thought lo1 = Thought341.getInstance(ao2, ao3, ao4, fo0);
    fb1 = fd1 > ld0;
    boolean lb2 = true;
    boolean lb3 = true;
if(fo1 != null){
      lb2 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    lb3 = !fb0;
    boolean lb4 = false;
    fb0 = !fb1;
    Thought lo5 = Thought65.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(lb2, lb3, lb4, fb0);
}
    fb1 = lb2 && lb3;
    Thought lo6 = Thought259.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb4, fb0, fb1, lb2);
    fd1 = ld0 - ad1;

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
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[8][3] += fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
        fb1 = fd1 < fd0;
        double ld0 = 754.4831956273496;
        ab1 = fd0 < fd1;
        if (ab2) {
            ab3 = ab4 && fb0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    Output.points[8][4] -= fd0;
    Output.points[8][5] -= fd1;
    boolean lb0 = true;
    double ld1 = 141.75525773690188;
    ld1 = ad1 + ad2;
    ab2 = ad3 > ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    ab2 = fd1 > ld1;
    if (ab3) {
        ab4 = !fb0;
        fb1 = ad1 > ad2;
        boolean lb2 = true;
if(fo1 != null){
          lb2 = fo1.m2(ao1, ao2, ao3, ao4);
}
        } else if (ab1) {
        ab2 = ab3 && ab4;
        Output.points[8][6] += ad3;
        } else if (fb0) {
        Thought lo3 = Thought42.getInstance(ad4, fd0, fd1, ld1);
        fb1 = ad1 > ad2;
        Thought lo4 = Thought295.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
if(ao3 != null){
          ao3.m1();
}
if(fo0 != null){
          ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
        for(int i0=0; i0<10; i0++){
}}
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought267.getInstance();
    Output.points[8][7] += fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = lb2 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, lb2, fb0);
}
    fd0 *= -1;
    Thought lo3 = Thought193.getInstance(fd1, fd0, fd1, fd0, fb1, lb1, lb2, fb0);
        fb1 = lb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
    Thought lo0 = Thought66.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    Output.points[8][8] -= fd1;
    if (ab1) {
        fd0 = fd1 + fd0;
        Output.points[0][0] -= fd1;
        Output.points[0][1] -= fd0;
        double ld1 = 280.5397122792389;
        fd0 *= -1;
        fd1 = ld1 - fd0;
        boolean lb2 = true;
        if (ab1) {
            boolean lb3 = true;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
            ld1 = fd0 - fd1;
            double ld4 = 695.9588581859749;
}}
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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
        ad3 *= -1;
        boolean lb1 = false;
        lb0 = fb0 && fb1;
        Output.points[0][2] -= ad4;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, lb0, fb0);
}
        fd0 = fd1 + ad1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    ad1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought180.getInstance();
if(fo0 != null){
      ad4 = fo0.m3(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought5.getInstance(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    lb3 = ad1 < ad2;
if(fo0 != null){
      ab1 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ab2 = !ab3;
    ab4 = ad1 > ad2;
    Thought lo4 = Thought377.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    Output.points[0][3] += ad1;
    boolean lb5 = true;
    ad2 *= -1;
    boolean lb6 = true;
    ab3 = ad3 < ad4;
    boolean lb7 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab3 = fd1 > ad1;
    ab4 = ad2 < ad3;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    Output.points[0][4] -= fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
    Thought lo0 = Thought152.getInstance(ad2, ad3, ad4, fd0);
    fd1 *= -1;
    boolean lb1 = true;
    lb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    double ld2 = 190.53175831876788;
    if (lb1) {
        double ld3 = 506.53117536274914;
        double ld4 = 322.1848051113433;
if(ao1 != null){
          fb0 = ao1.m2();
}
if(ao3 != null){
          ao2 = ao3.m4(fb1, lb1, fb0, fb1);
}
}
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
    Thought lo0 = Thought91.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    Output.points[0][5] -= fd0;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    Thought lo1 = Thought125.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    Output.points[0][6] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    boolean lb2 = false;
    ab4 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought94.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb0 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    fb1 = lb1 || ab1;
    Output.points[0][7] += ad3;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
        Output.points[0][8] -= ad2;
    ab2 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    ab3 = fd0 < fd1;

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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought262.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 917.8116927020244;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld2 = 569.8649376814252;
    ld2 = fd0 - fd1;

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
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    Output.points[1][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab3 = ab4 || fb0;
    Thought lo1 = Thought78.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fb1 = lb0 || ab1;
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought187.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 107.64565328451387;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought379.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, fb1, lb2, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    boolean lb4 = false;
    Thought lo5 = Thought384.getInstance(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb2);
        boolean lb6 = true;
    lb4 = ld1 < ad1;
    boolean lb7 = false;
    double ld8 = 332.526901163947;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    lb6 = lb7 && fb0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ad4 = fd0 + fd1;
    boolean lb0 = false;
    Output.points[1][1] -= ad1;
    double ld1 = 189.24773961149168;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
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
    double ld0 = 993.1023133665326;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ld0 = ao3.m3(lb1, fb0, fb1, lb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
if(ao3 != null){
      lb1 = ao3.m2(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    double ld2 = 933.8574723279007;
    double ld3 = 322.7606919233196;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld2, ld3, fd0);
}
    double ld5 = 704.3546100433676;
    fd0 = fd1 - ld0;
    ld2 *= -1;

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
    double ld0 = 826.1094146820371;
    fb0 = ld0 < ad1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, fb0);
}
    fd1 = ld0 + ad1;
    fb1 = lb1 && fb0;
    fb1 = !lb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fd1, ld0, ad1, ad2, lb1, fb0, fb1, lb1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought78.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fb1 = ab1 && ab2;
    boolean lb1 = true;
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought1.getInstance();
if(ao1 != null){
      fd1 = ao1.m3(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 + fd1;
    if (fb1) {
        lb1 = fd0 < fd1;
if(ao1 != null){
          ao1.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        ab1 = fd0 > fd1;
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
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
    double ld0 = 812.6431665399792;
    ab2 = ab3 && ab4;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought234.getInstance(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
}
    ad2 = ad3 + ad4;
    Output.points[1][2] += fd0;
    Output.points[1][3] += fd1;

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
    fd0 *= -1;
    Output.points[1][4] -= fd1;
    fb1 = !fb0;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
    double ld0 = 457.6778158711203;
if(fo1 != null){
      fb0 = fo1.m2(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought95.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    double ld2 = 883.0928143935192;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought148.getInstance(fb1, fb0, fb1, fb0);

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
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    double ld1 = 13.68452700580134;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    double ld2 = 785.2867180023112;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld2, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Output.points[1][5] -= fd0;
    lb0 = fb0 || fb1;
    fd1 = ld1 - ld2;
    double ld3 = 626.2650478867752;
    Thought lo4 = Thought60.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld1);
}
    Thought lo5 = Thought22.getInstance();
    lb0 = !fb0;
    boolean lb6 = true;
    Output.points[1][6] -= ld2;
    fb0 = ld3 < fd0;
    double ld7 = 49.672267273006554;
    double ld8 = 851.8425118350017;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb6, fb0);
}
    fb1 = lb0 && lb6;
    Thought lo9 = Thought132.getInstance(fo0, fo1, fo0, fo1, ld8, fd0, fd1, ld1, fb0, fb1, lb0, lb6);
    ld2 = ld3 - ld7;

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
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    Output.points[1][7] -= fd1;
    Output.points[1][8] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    Thought lo1 = Thought274.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    fb0 = fb1 || lb0;
        Output.points[2][0] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
        lb2 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
    Output.points[2][1] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
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
