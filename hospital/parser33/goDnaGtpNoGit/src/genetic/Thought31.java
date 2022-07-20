package genetic;
import java.util.ArrayList;
class Thought31 extends Thought{
private static ArrayList<Thought31> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 849.8664180478959;
private double fd1 = 184.36705450971343;
private Thought fo0 = null;
private Thought fo1 = null;
Thought31 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought31 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought31 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought31 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought31 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    lb0 = fd0 < fd1;
    boolean lb1 = true;
    lb1 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought65.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    double ld3 = 843.0621766476655;
    boolean lb4 = true;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
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
    fb0 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        fb0 = fb1 || lb0;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
              lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
            fb1 = ad1 > ad2;
            Output.points[7][0] += ad3;
            ad4 *= -1;
            fd0 *= -1;
            lb0 = fd1 < ad1;
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
            if (lb0) {
                Thought lo1 = Thought366.getInstance(fo0, fo1, fo0, fo1);
                fd1 *= -1;
                fb0 = ad1 > ad2;
if(fo0 != null){
                  ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
                fb1 = ad2 > ad3;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
                ad2 = ad3 + ad4;
                boolean lb2 = false;
                lb2 = fd0 < fd1;
if(fo1 != null){
                  fo1.m3();
}
if(fo1 != null){
                  fo0 = fo1.m4(lb0, fb0, fb1, lb2);
}
                lb0 = !fb0;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb2, lb0, fb0);
}
}}}
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
      fo0.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Output.points[7][1] += fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought243.getInstance(fd1, ad1, ad2, ad3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = fb0 || fb1;
    ab1 = ad2 < ad3;
    double ld1 = 311.9755458552724;
    ab2 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld1;
    ad1 = ad2 - ad3;
    Output.points[7][2] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > ld1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
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
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[7][3] += fd0;
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    double ld0 = 902.9746382621937;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought331.getInstance();
    fd1 = ld0 + fd0;
    fb1 = fd1 < ld0;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
        boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb2, fb0);
}
    fb1 = ld0 < fd0;
    double ld3 = 971.0123922061856;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld3, lb2, fb0, fb1, lb2);
}
    fd0 = fd1 - ld0;
    fb0 = fb1 && lb2;
if(fo0 != null){
      ao4 = fo0.m4(ld3, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
    Output.points[7][4] -= ld3;

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
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought157.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    Output.points[7][5] -= ad2;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
        fb1 = !lb0;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(lb2, fb0, fb1, lb0);
}
    lb2 = fb0 || fb1;

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
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    double ld0 = 325.8954019141008;
        fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
    double ld1 = 214.8282091677256;
if(ao1 != null){
      ld0 = ao1.m3(ld1, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ld1 = fd0 - fd1;
    ld0 = ld1 + fd0;
    fd1 = ld0 + ld1;
    ab1 = fd0 > fd1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[7][6] += ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m1();
}
    Thought lo0 = Thought356.getInstance(ab2, ab3, ab4, fb0);
    double ld1 = 546.5030058597696;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    Thought lo2 = Thought331.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab3 = ld1 > ad1;
    Output.points[7][7] += ad2;
    ab4 = !fb0;

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
    Thought lo0 = Thought265.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought345.getInstance();
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 84.31863964335487;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    fb0 = fb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    double ld1 = 57.334007575187044;
    Thought lo2 = Thought22.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought312.getInstance(fd0, fd1, ld0, ld1);
    fd0 = fd1 - ld0;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld1 = fd0 - fd1;
        Thought lo4 = Thought169.getInstance(ab1, ab2, ab3, ab4);
    boolean lb5 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = ad3 > ad4;
        fd0 = fd1 - ad1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        Output.points[7][8] -= fd0;
        boolean lb0 = false;
        fd1 = ad1 - ad2;
        boolean lb1 = true;
        lb1 = fb0 && fb1;
        ad3 *= -1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
        Thought lo2 = Thought321.getInstance(fo1, fo0, fo1, fo0);
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        for(int i1=0; i1<10; i1++){
            lb1 = fb0 || fb1;
if(fo0 != null){
              fo0.m3();
}
if(fo1 != null){
              fo1.m3(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
            lb0 = !lb1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    ab4 = fb0 && fb1;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    lb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo0 != null){
      ad2 = fo0.m3(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought211.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 || fb1;
    double ld1 = 732.896847725761;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld1, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
    fb1 = ld1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(fb0, fb1, fb0, fb1);
}
    double ld2 = 627.5577977670094;
    if (fb0) {
        fd0 = fd1 + ld1;
if(fo0 != null){
          ld2 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld2, fb1, fb0, fb1, fb0);
}
        double ld3 = 529.1588032879754;
if(ao4 != null){
          ld2 = ao4.m3(fd0, fd1, ld3, ld1, fb1, fb0, fb1, fb0);
}
        ld2 = fd0 - fd1;
        fb1 = ld3 < ld1;
if(fo0 != null){
          ld2 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m3(fd1, ld3, ld1, ld2);
}
        double ld4 = 909.4980475620206;
        fb0 = !fb1;
        Thought lo5 = Thought321.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld3);
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
    Thought lo0 = Thought166.getInstance();
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    if (fb0) {
        boolean lb2 = false;
        fb0 = fb1 && lb2;
if(ao2 != null){
          lb1 = ao2.m2(fb0, fb1, lb2, lb1);
}
        boolean lb3 = true;
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb2);
}
if(ao2 != null){
          ao2.m3(ad1, ad2, ad3, ad4, lb3, lb1, fb0, fb1);
}
        fd0 = fd1 + ad1;
        if (lb2) {
            lb3 = ad2 > ad3;
            lb1 = ad4 > fd0;
            boolean lb4 = false;
            fd1 = ad1 - ad2;
            lb1 = ad3 > ad4;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
    Output.points[8][0] -= fd0;
    double ld1 = 353.92509050852317;
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    if (fb1) {
        boolean lb2 = true;
if(ao1 != null){
          lb2 = ao1.m2(fd0, fd1, ld1, fd0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
        Output.points[8][1] -= ld1;
        lb0 = !ab1;
        fd0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
        lb2 = fd1 > ld1;
        lb0 = ab1 && ab2;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ld1 *= -1;
        lb2 = lb0 || ab1;
        for(int i0=0; i0<10; i0++){
            ab2 = ab3 && ab4;
            fb0 = fd0 > fd1;
            fb1 = lb2 && lb0;
            ab1 = ab2 || ab3;
            boolean lb3 = false;
            boolean lb4 = false;
            Output.points[8][2] -= ld1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fb1 = fd1 > ad1;
    ab1 = ab2 && ab3;
    ad2 = ad3 - ad4;
    fd0 *= -1;
        Thought lo0 = Thought54.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
    ab2 = fd1 < ad1;
    double ld1 = 580.0969931009209;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab3 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
}
    Thought lo2 = Thought207.getInstance();
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        ab3 = ab4 || fb0;
        ad2 = ad3 - ad4;
if(ao2 != null){
          ao1 = ao2.m4(fb1, lb3, ab1, ab2);
}
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb3);
}
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
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought354.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
        fb0 = !fb1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
        boolean lb2 = false;
        fb0 = fb1 && lb1;
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld0 = 932.0656127338352;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    Output.points[8][3] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[8][4] -= ld0;
    fb0 = fd0 > fd1;
    fb1 = ld0 > fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld0 = fd0 - fd1;

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
    Output.points[8][5] += ad2;
    boolean lb0 = false;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
    Thought lo1 = Thought202.getInstance(ad4, fd0, fd1, ad1);
    ad2 *= -1;
    ad3 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
    boolean lb2 = false;
if(fo0 != null){
      lb0 = fo0.m2();
}
    Thought lo3 = Thought392.getInstance(lb2, fb0, fb1, lb0);
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    lb2 = fb0 && fb1;
    ad1 = ad2 - ad3;

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
    double ld0 = 309.1428493539959;
    ab1 = ld0 > ad1;
    Output.points[8][6] -= ad2;
    Thought lo1 = Thought393.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought15.getInstance(ad3, ad4, fd0, fd1);
    if (ab2) {
        for(int i0=0; i0<10; i0++){
            ld0 *= -1;
if(fo1 != null){
              ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
            ab4 = fb0 || fb1;
            ab1 = ab2 || ab3;
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo0 != null){
              fd0 = fo0.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
            fb1 = ab1 || ab2;
            ad4 *= -1;
if(fo0 != null){
              fo0.m2(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
            ad2 = ad3 - ad4;
            Thought lo3 = Thought173.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
            fb0 = fd0 < fd1;
            fb1 = !ab1;
            for(int i1=0; i1<10; i1++){
                ld0 = ad1 + ad2;
                Thought lo4 = Thought305.getInstance(fo1, fo0, fo1, fo0);
                ab2 = ab3 && ab4;
                ad3 *= -1;
if(fo1 != null){
                  fo1.m3(ad4, fd0, fd1, ld0);
}
}}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2();
}
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    lb1 = lb2 && fb0;
        Output.points[8][7] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb1, lb2);
}
    fb0 = !fb1;
    boolean lb3 = false;
    Output.points[8][8] += fd0;
    lb0 = !lb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
}
    lb0 = fd1 < fd0;
    lb1 = lb2 && lb3;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = ad1 < ad2;
    Output.points[0][0] += ad3;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    fb0 = ad4 < fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought200.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);

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
if(ao1 != null){
      fd1 = ao1.m3();
}
    boolean lb0 = true;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    ab4 = fb0 && fb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    lb0 = lb1 && ab1;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1);
}
    boolean lb4 = true;
    boolean lb5 = false;
    lb1 = lb2 && lb3;
if(ao4 != null){
      lb4 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Output.points[0][1] += fd0;

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
    Output.points[0][2] -= ad1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m1();
}
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
    fb1 = !ab1;
if(ao2 != null){
      ad1 = ao2.m3(ab2, ab3, ab4, fb0);
}
    Output.points[0][3] -= ad2;
    Output.points[0][4] += ad3;
    ad4 = fd0 + fd1;
    fb1 = ad1 < ad2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    Output.points[0][5] -= ad4;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        lb0 = ad3 > ad4;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
        Thought lo0 = Thought91.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought76.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb2);
}
    lb3 = fd1 > fd0;
    fb0 = fb1 && lb2;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
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
    Output.points[0][6] -= fd1;
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab4 = !fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[0][7] += fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    boolean lb2 = false;
    ab3 = !ab4;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
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
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought254.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    double ld1 = 89.66520004394279;
    boolean lb2 = false;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
    double ld3 = 772.6418438218715;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(fd1, ld1, ld3, ad1);
}
    Output.points[0][8] -= ad2;
    Thought lo4 = Thought188.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld3 = ad1 + ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, ad1, ad2, ad3, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    lb2 = ad4 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld3, ad1);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          ab1 = fo1.m2();
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m2(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
    double ld1 = 258.2396719959938;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
        double ld2 = 91.10294586746177;
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
        fb1 = fb0 && fb1;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought133.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        boolean lb1 = false;
        fd1 *= -1;
        Thought lo2 = Thought168.getInstance();
        Thought lo3 = Thought93.getInstance(fb0, fb1, lb1, fb0);
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
    ad1 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought55.getInstance(ao1, ao2, ao3, ao4);
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb0 = ad2 > ad3;

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
    ab2 = fd1 < fd0;
    if (ab3) {
if(ao2 != null){
          fd1 = ao2.m3();
}
if(ao3 != null){
          ao3.m2(ab4, fb0, fb1, ab1);
}
        boolean lb0 = true;
        ab1 = fd0 > fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          ao4.m1(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        boolean lb1 = false;
        Thought lo2 = Thought273.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        if (lb0) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 625.4671598493076;
    Output.points[1][0] += ld0;
    boolean lb1 = true;
    ad1 = ad2 + ad3;
    boolean lb2 = false;
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(lb2, ab1, ab2, ab3);
}
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
    ab1 = ab2 || ab3;
    Thought lo3 = Thought191.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
    boolean lb4 = false;
    Output.points[1][1] += fd0;
    boolean lb5 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, lb4, lb5, ab1);
}
    ab2 = ab3 || ab4;
    fd1 = ld0 - ad1;
    fb0 = fb1 && lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[1][2] -= ad2;
    boolean lb6 = true;
    double ld7 = 963.9442893421154;

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
    fd1 *= -1;
    fb1 = fb0 && fb1;
        Output.points[1][3] -= fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    Output.points[1][4] -= fd0;
    double ld1 = 410.6096672964162;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 289.14865065162775;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 + fd1;
    fb0 = ld0 < fd0;
    fb1 = fd1 < ld0;
    boolean lb1 = true;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[1][5] += fd0;
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    fb1 = !lb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
    lb0 = lb1 && fb0;

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
