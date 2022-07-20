package genetic;
import java.util.ArrayList;
class Thought8 extends Thought{
private static ArrayList<Thought8> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 998.424483067485;
private double fd1 = 246.48810079595114;
private Thought fo0 = null;
private Thought fo1 = null;
Thought8 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought8 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought8 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought8 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought8 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    double ld1 = 51.29507079253563;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought63.getInstance(ld1, fd0, fd1, ld1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = fb0 && fb1;
    double ld3 = 66.50367197083351;
    Thought lo4 = Thought380.getInstance(lb0, fb0, fb1, lb0);

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
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        Thought lo2 = Thought279.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
        fd1 = fd0 + fd1;
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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad1 *= -1;
    fb0 = !fb1;
    lb0 = !fb0;
    fb1 = !lb0;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    double ld1 = 209.61422952958662;
    Thought lo2 = Thought307.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fd1 = ld1 + ad1;
    ad2 = ad3 - ad4;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m3();
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(lb0, lb3, fb0, fb1);
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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Output.points[1][6] += fd1;
    ab2 = ad1 > ad2;
    ad3 *= -1;
    boolean lb0 = false;
    double ld1 = 326.742346819859;
    ad3 = ad4 - fd0;
    Thought lo2 = Thought23.getInstance(fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ad3 *= -1;

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
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought83.getInstance();
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Thought lo0 = Thought37.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 574.4708213511577;
    fb1 = fd0 > fd1;
    ld1 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        Output.points[1][7] += fd0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
}
        boolean lb2 = true;
        fb0 = ad4 > fd0;
        fd1 *= -1;
        fb1 = !lb2;
        ld1 = ad1 - ad2;
if(fo1 != null){
          fo1.m2();
}
        fb0 = fb1 && lb2;
if(ao1 != null){
          ad3 = ao1.m3(fb0, fb1, lb2, fb0);
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
    ab1 = ab2 && ab3;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    double ld0 = 156.7908628368773;
    boolean lb1 = true;
    double ld2 = 878.9544956916877;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ld0 = ld2 - fd0;
    ab4 = !fb0;
if(ao3 != null){
      ao3.m1(fd1, ld0, ld2, fd0);
}
        fb1 = fd1 > ld0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld0);
}
    ld2 = fd0 + fd1;
    lb1 = ld0 < ld2;
    double ld3 = 947.8267857952889;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo4 = Thought392.getInstance(ab1, ab2, ab3, ab4);
    Thought lo5 = Thought206.getInstance(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
    ld2 = ld3 - fd0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m2(fd1, ld0, ld2, ld3, ab2, ab3, ab4, fb0);
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
    double ld0 = 102.73575508805651;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ld0);
}
    Output.points[1][8] += ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    Output.points[2][0] += fd1;
    fb0 = ld0 < ad1;
    Output.points[2][1] -= ad2;
    ad3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo1 = Thought164.getInstance(fb1, ab1, ab2, ab3);
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    Output.points[2][2] -= ad1;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            lb2 = ab1 || ab2;
            ab3 = ad2 > ad3;
            ad4 = fd0 + fd1;
            ab4 = ld0 < ad1;
            ad2 = ad3 + ad4;
            double ld3 = 732.6644724694258;
            boolean lb4 = false;
            Thought lo5 = Thought112.getInstance(ad4, fd0, fd1, ld3, ab4, fb0, fb1, lb4);
            ld0 = ad1 + ad2;
            Output.points[2][3] -= ad3;
            double ld6 = 181.36847187385618;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 || fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    Output.points[2][4] -= fd0;
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    Thought lo2 = Thought234.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      lb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
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
    fd0 *= -1;
    ab2 = !ab3;
    fd1 = fd0 - fd1;
    ab4 = fb0 || fb1;
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    Thought lo1 = Thought146.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    Thought lo2 = Thought142.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab3 = !ab4;
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    double ld3 = 407.2461591885395;
    ab4 = fb0 || fb1;
    boolean lb4 = false;
    lb0 = ld3 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = true;
if(fo1 != null){
      fo1.m3(lb4, lb5, ab1, ab2);
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
    fb0 = !fb1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought375.getInstance(ad3, ad4, fd0, fd1);
    lb1 = ad1 > ad2;
    double ld3 = 995.9887901907576;
    Thought lo4 = Thought68.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
        fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo5 = Thought133.getInstance(lb0, lb1, fb0, fb1);
    fd1 *= -1;
    boolean lb6 = false;
    lb0 = ld3 > ad1;
    lb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    lb6 = fb0 || fb1;
    lb0 = ld3 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, lb6, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld3, ad1, ad2, ad3, lb0, lb1, lb6, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo0 = Thought228.getInstance(ab1, ab2, ab3, ab4);
    ad2 = ad3 - ad4;
        boolean lb1 = true;
    ab4 = fb0 || fb1;
    boolean lb2 = false;
    Output.points[2][5] += fd0;
    boolean lb3 = false;
    lb1 = lb2 && lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb2);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    double ld4 = 744.1547432479925;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb1 = fd0 > fd1;
    Thought lo5 = Thought325.getInstance(fo0, fo1, fo0, fo1);

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
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = !fb1;
if(ao4 != null){
      ao4.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought303.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);

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
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = ad2 > ad3;
    fb1 = lb0 && fb0;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo2 = Thought1.getInstance();
if(ao1 != null){
      ad4 = ao1.m3(fb0, fb1, lb0, lb1);
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
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb0 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = fd1 > fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought60.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    Thought lo2 = Thought200.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);

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
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3();
}
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao3.m3(ab4, fb0, fb1, ab1);
}
    fd1 = ad1 - ad2;
    boolean lb0 = true;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
    double ld2 = 616.0804933659304;
    Thought lo3 = Thought84.getInstance(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 83.03061015264466;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    Output.points[2][6] -= fd1;
    double ld1 = 67.78616618940968;
    boolean lb2 = true;
    Thought lo3 = Thought194.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
    fb0 = ld0 < ld1;
    fb1 = lb2 || fb0;
if(fo0 != null){
      fd0 = fo0.m3();
}
    if (fb1) {
if(fo1 != null){
          fd1 = fo1.m3(lb2, fb0, fb1, lb2);
}
        Output.points[2][7] -= ld0;
        ld1 = fd0 - fd1;
        fb0 = fb1 || lb2;
        Output.points[2][8] -= ld0;
        ld1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
        Output.points[3][0] += ld0;
        fb1 = ld1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld1, fd0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
        double ld4 = 500.7582897365592;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
if(fo0 != null){
          ab1 = fo0.m2();
}
        fd0 *= -1;
if(fo1 != null){
          fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb1 = true;
        fd1 = fd0 + fd1;
        lb1 = lb0 && ab1;
        Thought lo2 = Thought164.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        fd0 = fd1 - fd0;
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
    double ld0 = 595.2915798117693;
if(fo0 != null){
      fo0.m1();
}
    fb0 = fb1 || fb0;
    double ld1 = 437.9840898061001;
    double ld2 = 371.9169997379765;
    ld0 = ld1 - ld2;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[3][1] += fd0;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2(fd1, ld0, ld1, ld2, lb3, fb0, fb1, lb3);
}
    fb0 = !fb1;
    lb3 = ad1 > ad2;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
    double ld4 = 965.1463182797179;
        double ld5 = 933.583677723161;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, ld1, ld2, ld4);
}
    fb1 = ld5 > ad1;

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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought384.getInstance();
    boolean lb1 = true;
    ad2 = ad3 - ad4;
    boolean lb2 = true;
    boolean lb3 = true;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    Thought lo4 = Thought289.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ad3 < ad4;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb1, lb2, lb3);
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
    boolean lb0 = true;
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought136.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb0 = lb2 || fb0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Output.points[3][2] += fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
        ad1 *= -1;
        fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
        fb1 = fd1 > ad1;
        Output.points[3][3] -= ad2;
if(ao3 != null){
          ao3.m1();
}
        double ld0 = 242.8898056441404;
        ad2 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
        Output.points[3][4] += ad3;
        fb0 = ad4 < fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        } else {
        boolean lb1 = false;
        fb0 = fb1 && lb1;
        fb0 = fb1 || lb1;
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
    boolean lb0 = true;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought395.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    if (fb1) {
        boolean lb2 = false;
        lb2 = lb0 || ab1;
        ab2 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        ab3 = !ab4;
        fb0 = fd1 > fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        Output.points[3][5] -= fd1;
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb2, lb0, ab1);
}
        } else if (ab3) {
        fd0 = fd1 - fd0;
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
        for(int i0=0; i0<10; i0++){
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][6] -= ad1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought74.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
    ab2 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb0 = fd1 < ad1;
    Thought lo2 = Thought249.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    boolean lb3 = false;
    lb3 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb3);
}
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    if (ab1) {
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
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
    double ld1 = 726.7594167193656;
    Output.points[3][7] -= ld1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    double ld2 = 394.55085904693914;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld1;
    boolean lb3 = false;
    lb0 = !lb3;
if(fo0 != null){
      fo0.m3(ld2, fd0, fd1, ld1);
}
    ld2 = fd0 - fd1;
    fb0 = ld1 > ld2;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo1.m3();
}
    ab3 = !ab4;
    double ld0 = 584.4567966221565;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    fb0 = !fb1;
    Thought lo3 = Thought385.getInstance(fd1, ld0, fd0, fd1, lb1, lb2, ab1, ab2);
    if (ab3) {
        ld0 = fd0 - fd1;
        ld0 = fd0 + fd1;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    double ld0 = 164.77237016409586;
    ad2 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought146.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
    lb2 = lb3 && fb0;
    fb1 = ld0 < ad1;
    ad2 = ad3 + ad4;
    double ld4 = 287.81799783182146;
    lb2 = ad4 > fd0;
    lb3 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ld0 + ld4;
    fb1 = lb2 && lb3;

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
    double ld0 = 553.1385009705212;
    double ld1 = 88.74200307637216;
    for(int i0=0; i0<10; i0++){
        ld0 = ld1 + ad1;
        ab1 = ad2 < ad3;
        ab2 = ab3 || ab4;
        fb0 = ad4 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld1, ad1);
}
        fb1 = ad2 < ad3;
        Output.points[3][8] -= ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1);
}
        ab1 = !ab2;
        ad2 = ad3 + ad4;
        fd0 = fd1 - ld0;
        ab3 = ld1 < ad1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad2 = ad3 - ad4;
        fd0 *= -1;
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
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    Output.points[4][0] += fd1;
    boolean lb1 = true;
    Thought lo2 = Thought270.getInstance(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    boolean lb3 = true;
    boolean lb4 = false;
    lb1 = fd0 > fd1;
if(ao1 != null){
      lb3 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb5 = false;
if(ao2 != null){
      lb4 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb5, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb1, lb3, lb4, lb5);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought225.getInstance(ao3, ao4, fo0, fo1);
    double ld1 = 894.9317035956321;
    fb1 = !fb0;
    Output.points[4][1] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, ad1, ad2);
}
    Output.points[4][2] += ad3;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb2 = true;
    fb0 = fd0 > fd1;
    double ld3 = 600.8418742058245;
    for(int i0=0; i0<10; i0++){
        ld1 = ld3 + ad1;
if(ao2 != null){
          ad2 = ao2.m3();
}
        boolean lb4 = false;
        fb0 = ad3 < ad4;
        double ld5 = 394.30067068442713;
        fb1 = ad4 < fd0;
if(ao3 != null){
          lb4 = ao3.m2(lb2, fb0, fb1, lb4);
}
        lb2 = fd1 < ld5;
        if (fb0) {
            double ld6 = 453.2278748970134;
}}
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
    Thought lo0 = Thought153.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    Output.points[4][3] += fd1;
    lb1 = ab1 || ab2;
    fd0 = fd1 + fd0;
    ab3 = fd1 > fd0;
    ab4 = !fb0;
    Output.points[4][4] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;

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
    Thought lo0 = Thought107.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 || ab3;
    Output.points[4][5] += fd1;
if(ao1 != null){
      ad1 = ao1.m3(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 + ad2;
    Output.points[4][6] -= ad3;
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
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
    fb0 = fb1 || fb0;
    double ld0 = 510.80908624611743;
    double ld1 = 200.36240716923544;
    fb1 = fb0 && fb1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld0, ld1);
}
    fd0 = fd1 + ld0;
    boolean lb2 = false;
    ld1 = fd0 + fd1;
    boolean lb3 = false;
    lb2 = ld0 > ld1;
    fd0 = fd1 + ld0;
    lb3 = fb0 && fb1;
    ld1 *= -1;
        lb2 = fd0 > fd1;
    boolean lb4 = true;
    ld0 = ld1 - fd0;
    boolean lb5 = false;

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
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    fb0 = !fb1;
    Output.points[4][7] += fd0;
    Thought lo1 = Thought322.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2();
}
    Thought lo2 = Thought125.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought123.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
    boolean lb0 = false;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    lb0 = fb0 || fb1;
    boolean lb1 = true;
    double ld2 = 348.57625964317634;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb0, lb1, fb0, fb1);
}
    Output.points[4][8] -= fd1;
    double ld3 = 712.4928548905779;
    boolean lb4 = false;
    lb0 = ld2 > ld3;

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
