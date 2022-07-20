package genetic;
import java.util.ArrayList;
class Thought342 extends Thought{
private static ArrayList<Thought342> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 868.716198894949;
private double fd1 = 841.2756481617765;
private Thought fo0 = null;
private Thought fo1 = null;
Thought342 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought342 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought342 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought342 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought342 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought342 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought342 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought342 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought342 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought342 instance = new Thought342 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought342 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought342 instance = new Thought342 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought342 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought342 instance = new Thought342 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought342 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought342 instance = new Thought342 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought342 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought342 instance = new Thought342 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought342 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought342 instance = new Thought342 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought342 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought342 instance = new Thought342 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought342 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought342 instance = new Thought342 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    Thought lo0 = Thought187.getInstance(fd0, fd1, fd0, fd1);
    Output.points[1][2] -= fd0;
    fd1 = fd0 - fd1;
    Output.points[1][3] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    double ld1 = 837.703735789188;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    Output.points[1][4] += ld1;
    Thought lo3 = Thought215.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
    fd1 = ld1 - fd0;
    fb1 = fd1 > ld1;
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
}
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    Output.points[1][5] += fd1;
    ld1 *= -1;
    lb2 = fd0 > fd1;
    ld1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
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
    ab1 = fd0 > fd1;
    double ld0 = 586.1702487469744;
    double ld1 = 711.8474971447406;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    double ld2 = 599.1817495368057;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb3 = false;
    double ld4 = 161.71853060574819;
    double ld5 = 431.2377506985341;
    ab3 = !ab4;
    ld0 = ld1 + ld2;
if(fo0 != null){
      fb0 = fo0.m2(ld4, ld5, fd0, fd1, fb1, lb3, ab1, ab2);
}
    ab3 = ld0 > ld1;
    ld2 = ld4 - ld5;

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
    ad2 = ad3 - ad4;
    Thought lo0 = Thought334.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    Output.points[1][6] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    if (fb0) {
        ad1 *= -1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
            fd0 = fd1 + ad1;
            Output.points[1][7] += ad2;
            boolean lb1 = false;
            lb1 = fb0 || fb1;
if(fo0 != null){
              ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
            for(int i1=0; i1<10; i1++){
if(fo1 != null){
                  fo1.m1(ad4, fd0, fd1, ad1);
}
                boolean lb2 = false;
                ad2 = ad3 + ad4;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
                Thought lo3 = Thought366.getInstance();
if(fo0 != null){
                  fo0.m2(lb2, lb1, fb0, fb1);
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
    ad1 = ad2 + ad3;
    Output.points[1][8] -= ad4;
    boolean lb0 = true;
    Thought lo1 = Thought54.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
    boolean lb2 = false;
    boolean lb3 = false;
    ab2 = ad3 > ad4;
    Thought lo4 = Thought310.getInstance(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, lb3, ab1);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ab2 = ad1 < ad2;
    ad3 *= -1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
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
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought339.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Output.points[2][0] += fd1;
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought88.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
    Output.points[2][1] -= fd0;
    fb1 = fd1 < fd0;
    if (fb0) {
        boolean lb2 = false;
        boolean lb3 = false;
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
    Thought lo0 = Thought175.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fb1 = fd1 > ad1;
    double ld1 = 497.56269658463265;
    boolean lb2 = false;
    lb2 = ad1 > ad2;
    fb0 = fb1 && lb2;
    Thought lo3 = Thought178.getInstance();
    double ld4 = 594.0851338509914;
    ad2 = ad3 + ad4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ld4, fb0, fb1, lb2, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;

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
    ab1 = fd0 < fd1;
    ab2 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    ab3 = ab4 && fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought374.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = !fb0;
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    ab4 = fb0 && fb1;
        ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    ab4 = fd0 > fd1;

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
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 || ab4;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, lb0);
}
    lb1 = ab1 && ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, lb0, lb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 < fd0;
    fb0 = fb1 && lb0;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        fd1 *= -1;
        double ld1 = 488.1126107689832;
        ld1 = fd0 + fd1;
if(fo0 != null){
          fo0.m2(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
        boolean lb2 = true;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
    Thought lo0 = Thought201.getInstance(fo0, fo1, fo0, fo1);
    ab3 = ab4 && fb0;
    Thought lo1 = Thought353.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fb1 = !ab1;
    if (ab2) {
        Output.points[2][2] -= fd1;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
        for(int i0=0; i0<10; i0++){
            fd0 *= -1;
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
            fd0 = fd1 - fd0;
if(fo1 != null){
              fb1 = fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    double ld1 = 667.2595978631921;
    Output.points[2][3] -= ad2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
    Output.points[2][4] -= ld1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
        double ld0 = 546.2090204119853;
    Thought lo1 = Thought156.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    Output.points[2][5] -= ld0;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    Thought lo2 = Thought20.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    boolean lb3 = true;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    fb1 = lb3 || ab1;
    Thought lo4 = Thought140.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
    Thought lo5 = Thought396.getInstance();
    boolean lb6 = true;
if(fo1 != null){
      ad4 = fo1.m3(ab1, ab2, ab3, ab4);
}
    double ld7 = 649.2450742806135;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, lb3, lb6);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 910.056104963481;
    fb0 = ld0 < fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = ld0 + fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
        fb0 = !fb1;
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought90.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
    double ld2 = 657.8937840072493;
    Thought lo3 = Thought377.getInstance(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    fd1 = ld2 - ad1;
    fb1 = ad2 < ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld2);
}
    ad1 = ad2 + ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
    Output.points[2][6] += ad1;
    boolean lb4 = false;
    Thought lo5 = Thought31.getInstance();
    lb0 = ad2 > ad3;
    lb4 = fb0 && fb1;
    ad4 = fd0 + fd1;
    lb0 = !lb4;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, lb4);
}
    boolean lb6 = true;
    ld2 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2, lb6, fb0, fb1, lb0);
}
    lb4 = lb6 && fb0;
    ad3 = ad4 + fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    double ld0 = 886.5998264176919;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought48.getInstance(lb1, ab1, ab2, ab3);
    double ld3 = 2.2895715753443464;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
        boolean lb4 = true;
    Thought lo5 = Thought160.getInstance(ld3, fd0, fd1, ld0, lb4, ab1, ab2, ab3);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
}
    ld3 = fd0 + fd1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb6 = false;
    lb4 = ld3 > fd0;
    fd1 = ld0 + ld3;
if(ao2 != null){
      ao2.m2(fd0, fd1, ld0, ld3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld3);
}
    boolean lb7 = true;
    fd0 = fd1 - ld0;
if(ao2 != null){
      lb6 = ao2.m2();
}

Thought.STACK_COUNTER++;
return lb7;
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
    ab1 = ad3 < ad4;
    ab2 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought175.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 = fd1 - ad1;
    ad2 *= -1;
    ad3 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ad2 *= -1;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    double ld0 = 204.11992124807688;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
    double ld2 = 123.32862358285557;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    fb0 = ld2 > fd0;

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
    ab1 = !ab2;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    ab3 = fd0 > fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo2 = Thought77.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    Output.points[2][7] -= fd0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, lb3, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
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
    Output.points[2][8] -= ad1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought128.getInstance();
    Thought lo1 = Thought330.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    Thought lo2 = Thought61.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    ad2 *= -1;
    lb3 = fb0 || fb1;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
    fd1 = ad1 - ad2;
    Thought lo4 = Thought350.getInstance(lb3, fb0, fb1, lb3);
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb5, fb0, fb1, lb3);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, lb5, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb3);
}
    boolean lb6 = true;
    lb5 = lb6 && fb0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    ab3 = ab4 || fb0;
    fd1 *= -1;
    fb1 = ad1 < ad2;
    lb0 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ab3 = ab4 || fb0;
    ad1 *= -1;
    boolean lb1 = false;
if(fo1 != null){
      ad2 = fo1.m3();
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought354.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    Thought lo0 = Thought308.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought195.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
}
    fb1 = lb1 || fb0;
    fb1 = !lb1;

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
    ad2 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      ad1 = ao2.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = fd0 < fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought1.getInstance(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);

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
    ab2 = fd1 > fd0;
    Thought lo0 = Thought362.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    ab1 = fd1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[3][0] += fd0;
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = !ab3;
if(ao3 != null){
      fd1 = ao3.m3(ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    Output.points[3][1] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fb1 = ab1 || ab2;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought307.getInstance(ao2, ao3, ao4, fo0);
        ab4 = !fb0;
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
        fb1 = ad4 > fd0;
        boolean lb2 = false;
        boolean lb3 = true;
        Output.points[3][2] += fd1;
        lb2 = lb3 || lb0;
        ab1 = ab2 || ab3;
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
        ab4 = ad1 > ad2;
        fb0 = fb1 || lb2;
        double ld4 = 494.9256416841508;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ad2 *= -1;
        Output.points[3][3] -= ad3;
if(fo0 != null){
          ao4 = fo0.m4(lb3, lb0, ab1, ab2);
}
        ab3 = !ab4;
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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
        double ld1 = 229.55276618877903;
        fb1 = ld1 > fd0;
        lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
        fd1 = ld1 - fd0;
        lb0 = !fb0;
        fd1 = ld1 + fd0;
        if (fb1) {
if(fo0 != null){
              fo1 = fo0.m4();
}
if(fo1 != null){
              fd1 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
              fd0 = fo1.m3(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
}}
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
    Output.points[3][4] += fd1;
    fd0 *= -1;
    ab2 = !ab3;
    double ld0 = 1.9742692549298249;
    Thought lo1 = Thought242.getInstance(fo0, fo1, fo0, fo1);
    Thought lo2 = Thought108.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    fb0 = fd0 < fd1;
    ld0 = fd0 - fd1;
    boolean lb3 = true;
    Output.points[3][5] -= ld0;
    Output.points[3][6] -= fd0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    Thought lo0 = Thought134.getInstance();
if(fo0 != null){
          fo0.m1(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought167.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld2 = 304.24797747506744;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld2, ad1);
}
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
    fb0 = ld2 > ad1;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[3][7] += ad2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld2 > ad1;
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought134.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd1 = ld2 - ad1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld2);
}
    boolean lb4 = true;

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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought302.getInstance();
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    ab1 = ad1 < ad2;

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
    fd1 *= -1;
    double ld0 = 571.8968469794316;
    Output.points[3][8] -= ld0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld0;
    boolean lb1 = true;
    fb0 = !fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
    ld0 = fd0 - fd1;
    fb0 = ld0 < fd0;
    Thought lo2 = Thought342.getInstance(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
    lb1 = ld0 > fd0;
    fb0 = fd1 > ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
        Output.points[4][0] -= fd0;

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
    ad1 *= -1;
if(ao1 != null){
              fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    for(int i0=0; i0<10; i0++){
        Output.points[4][1] += ad2;
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo1.m2(fd1, ad1, ad2, ad3);
}
        fb1 = ad4 < fd0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        boolean lb0 = false;
        lb0 = fb0 || fb1;
        lb0 = fb0 || fb1;
        boolean lb1 = true;
        boolean lb2 = true;
if(ao1 != null){
          fo1 = ao1.m4();
}
        double ld3 = 150.29832366784584;
        Output.points[4][2] += ad4;
        }
    fd1 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought221.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ab4 = fb0 && fb1;

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
    ab1 = ad1 > ad2;
    ad3 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      fd1 = ao4.m3(ab2, ab3, ab4, fb0);
}
    double ld0 = 100.87443875657337;
    fb1 = !ab1;
    ld0 = ad1 + ad2;
    ad3 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
        fd0 *= -1;
    double ld2 = 62.63759723893178;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        Output.points[4][3] -= fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld2, ad1);
}
        }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ld0 = ld2 + ad1;

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
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = lb0 || fb0;
        fb1 = lb0 || fb0;
    fb1 = fd0 < fd1;
    double ld1 = 535.3748466286536;
    Output.points[4][4] += ld1;
    boolean lb2 = false;
    lb0 = lb2 || fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    lb0 = fd1 > ld1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2();
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    fd1 *= -1;
    fb1 = lb0 || lb1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld2 = 130.10574784949537;
    Output.points[4][5] -= ld2;
    fb0 = fb1 && lb0;
    Thought lo3 = Thought136.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);

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
    Thought lo0 = Thought49.getInstance();
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fd1 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
    Thought lo3 = Thought386.getInstance(fo1, fo0, fo1, fo0);
    lb2 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
        Output.points[4][6] -= fd0;
    fb1 = fd1 < fd0;
    Output.points[4][7] += fd1;
    lb1 = fd0 < fd1;
    Output.points[4][8] -= fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    lb2 = !fb0;

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
