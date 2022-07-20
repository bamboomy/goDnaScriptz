package genetic;
import java.util.ArrayList;
class Thought3 extends Thought{
private static ArrayList<Thought3> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 770.9244574606315;
private double fd1 = 250.55867262616908;
private Thought fo0 = null;
private Thought fo1 = null;
Thought3 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought3 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought3 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought3 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought3 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    double ld1 = 623.9734570310729;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][2] -= ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb0);
}
    double ld4 = 154.55159347965227;
    double ld5 = 766.8491774914331;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ld4, ld5, fd0, fd1, lb3, fb0, fb1, lb0);
}
    if (lb2) {
        ld1 *= -1;
        boolean lb6 = true;
        lb2 = ld4 < ld5;
        lb3 = !fb0;
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
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought352.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    double ld1 = 994.2485448745401;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo0.m3(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;
    fb1 = !ab1;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      ld1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = !ab3;
    fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;
    double ld2 = 905.5146532912474;
    ab4 = ld2 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0, fb0, fb1, ab1, ab2);
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought174.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought153.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    ad3 *= -1;
    fb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought161.getInstance();
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
        Output.points[3][3] += ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab2 = ab3 && ab4;
        for(int i1=0; i1<10; i1++){
            ad3 = ad4 + fd0;
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
            boolean lb0 = false;
            for(int i2=0; i2<10; i2++){
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
                fb1 = lb0 && ab1;
                ab2 = ab3 || ab4;
                fb0 = ad4 < fd0;
                fb1 = fd1 < ad1;
                Thought lo1 = Thought59.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
                fd1 = ad1 + ad2;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
                if (ab1) {
                    double ld2 = 35.63162791473506;
}}}}
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
    fb0 = fd0 > fd1;
    Output.points[3][4] += fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought169.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    Thought lo1 = Thought363.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    fd1 *= -1;
        Thought lo2 = Thought311.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
    Thought lo4 = Thought107.getInstance(fo1, ao1, ao2, ao3);

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
    ad1 *= -1;
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought194.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
    Thought lo1 = Thought77.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
        boolean lb2 = false;
        lb2 = ad2 < ad3;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, lb2, fb0);
}
        }
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld3 = 247.74914804534495;
    fb1 = !fb0;
    fd0 = fd1 + ld3;
    fb1 = !fb0;
    ad1 *= -1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb4 = false;
    boolean lb5 = true;
    Output.points[3][5] += ad3;
    boolean lb6 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
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
    boolean lb0 = true;
        double ld1 = 68.01433900072186;
    Output.points[3][6] += ld1;
    ab1 = !ab2;
    Output.points[3][7] += fd0;
    fd1 = ld1 - fd0;
    boolean lb2 = true;
    Thought lo3 = Thought92.getInstance(fd1, ld1, fd0, fd1);
    ab2 = ld1 > fd0;
    fd1 = ld1 + fd0;
    Thought lo4 = Thought391.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
    boolean lb5 = true;
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
    Output.points[3][8] -= ld1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[4][0] += fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ab2 = ad2 < ad3;
    ab3 = ad4 > fd0;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    Thought lo0 = Thought107.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought268.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ab3 = ab4 && fb0;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought127.getInstance(ad1, ad2, ad3, ad4);
    Thought lo3 = Thought99.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
    boolean lb4 = false;
    fb0 = ad3 < ad4;

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
      fo1 = fo0.m4();
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo1.m2(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        Output.points[4][1] -= fd0;
        fb0 = fb1 && fb0;
        fb1 = fd1 < fd0;
        boolean lb0 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        boolean lb1 = false;
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought210.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (ab1) {
        Output.points[4][2] += fd1;
        ab2 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        Thought lo1 = Thought59.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        double ld2 = 784.3144548998729;
        Thought lo3 = Thought318.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
        if (ab1) {
            fd0 *= -1;
}}
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
        boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        Output.points[4][3] -= ad1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad2 = ad3 - ad4;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
        double ld1 = 101.08443495500235;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        boolean lb2 = false;
        boolean lb3 = false;
        Output.points[4][4] -= ad4;
        Thought lo4 = Thought290.getInstance(fd0, fd1, ld1, ad1, lb3, lb0, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 157.8281502192946;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 < ad1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    ab3 = ab4 && fb0;
        fb1 = ad3 < ad4;
    fd0 = fd1 + ld0;
    boolean lb2 = true;
if(fo1 != null){
      lb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought303.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3();
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Thought lo1 = Thought370.getInstance(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought107.getInstance(fd1, fd0, fd1, fd0);
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb3 = fo1.m2();
}
if(ao1 != null){
      ao1.m2(fb0, fb1, lb0, lb3);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb3);
}
    fb0 = !fb1;
    double ld4 = 958.350027443796;
    Thought lo5 = Thought128.getInstance(fd0, fd1, ld4, fd0, lb0, lb3, fb0, fb1);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb0, lb3, fb0, fb1);
}
    lb0 = fd1 < ld4;
    Thought lo6 = Thought349.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld4, fd0);
}
    Thought lo7 = Thought225.getInstance(fo1, ao1, ao2, ao3, fd1, ld4, fd0, fd1);
    ld4 = fd0 - fd1;
    ld4 *= -1;
    fd0 *= -1;
if(ao4 != null){
      ao4.m2();
}
    fd1 *= -1;
    lb3 = ld4 > fd0;
    fd1 *= -1;
    fb0 = fb1 || lb0;
    lb3 = fb0 && fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
        ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb1 = true;
    Output.points[4][5] += fd0;
    lb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(lb0, lb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    lb0 = ad4 < fd0;
    double ld2 = 110.03355803179012;
    boolean lb3 = false;
        fd0 = fd1 + ld2;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, lb1, lb3, fb0, fb1);
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
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought65.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m1();
}
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb0, ab1);
}
    fd1 = fd0 + fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    double ld0 = 662.8166443321009;
    Thought lo1 = Thought394.getInstance(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
    double ld2 = 562.9623790567434;
    fd0 *= -1;
    boolean lb3 = false;
    ab2 = ab3 || ab4;
    Output.points[4][6] += fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ld0, ld2, ad1, ad2);
}
    if (lb3) {
        Output.points[4][7] += ad3;
        double ld4 = 51.92727322630342;
        double ld5 = 44.13009261218529;
        double ld6 = 249.71327097750302;
        } else {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
        Thought lo7 = Thought243.getInstance();
        ld2 *= -1;
        ab1 = ab2 && ab3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    double ld0 = 377.6876465409308;
    fd0 *= -1;
    boolean lb1 = false;
    double ld2 = 914.4057854860669;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, lb1, fb0, fb1, lb1);
}
    Thought lo3 = Thought42.getInstance(fd0, fd1, ld0, ld2, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    boolean lb4 = false;
    lb1 = !lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld5 = 44.70978274654103;
if(fo0 != null){
      fo1 = fo0.m4(ld5, fd0, fd1, ld0);
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld0);
}
    ld2 = ld5 + fd0;
    boolean lb6 = true;
    boolean lb7 = true;
if(fo0 != null){
      lb6 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(lb7, fb0, fb1, lb1);
}
    fd1 = ld0 - ld2;
    Thought lo8 = Thought246.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld0, lb4, lb6, lb7, fb0);
    Output.points[4][8] -= ld2;

Thought.STACK_COUNTER++;
return ld5;
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
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    double ld0 = 521.3197906422357;
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld1 = 179.93015701362583;
        ab1 = ld0 > ld1;
    double ld2 = 754.4944617535986;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && ab1;
    Output.points[5][0] -= ld2;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m2(ld1, ld2, fd0, fd1);
}
    ld0 *= -1;
    boolean lb3 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    double ld1 = 989.1083993620401;
    lb0 = ad2 < ad3;
    if (fb0) {
        ad4 = fd0 - fd1;
        ld1 = ad1 - ad2;
        fb1 = !lb0;
        fb0 = ad3 < ad4;
        double ld2 = 140.23011300639118;
        fb1 = ad4 > fd0;
        Thought lo3 = Thought312.getInstance();
        boolean lb4 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    double ld0 = 794.3934271636443;
    double ld1 = 685.9320626634818;
    ab4 = ld1 < ad1;
    boolean lb2 = true;
    ab4 = ad2 < ad3;
    ad4 = fd0 + fd1;
    fb0 = ld0 > ld1;
    Thought lo3 = Thought132.getInstance(fb1, lb2, ab1, ab2);
    ab3 = ab4 || fb0;
    fb1 = ad1 < ad2;
    lb2 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought57.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb2, ab1);
    Thought lo5 = Thought72.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    boolean lb6 = true;
    for(int i0=0; i0<10; i0++){
        double ld7 = 476.20644096881097;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - ld7;
        fb0 = ld0 > ld1;
        boolean lb8 = true;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 897.3139201879598;
    fb1 = fb0 && fb1;
    fb0 = ld0 < fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        double ld1 = 364.5016378578024;
        fd0 = fd1 - ld1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld1);
}
        ld0 = fd0 - fd1;
if(ao2 != null){
          ao2.m3();
}
        fb1 = !fb0;
        fb1 = fb0 && fb1;
        ld1 = ld0 + fd0;
        fd1 = ld1 - ld0;
        fd0 = fd1 - ld1;
        fb0 = fb1 || fb0;
        boolean lb2 = false;
        fb0 = fb1 || lb2;
        fb0 = ld0 > fd0;
        Thought lo3 = Thought322.getInstance(fb1, lb2, fb0, fb1);
        Output.points[5][1] -= fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(ao3 != null){
          ld1 = ao3.m3(ld0, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
        fb1 = lb2 && fb0;
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
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    if (lb0) {
        fd0 = fd1 + ad1;
        } else if (fb0) {
        fb1 = lb0 || fb0;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        fb1 = lb0 || fb0;
        } else {
        Thought lo1 = Thought211.getInstance(ad2, ad3, ad4, fd0);
        fd1 *= -1;
        Output.points[5][2] += ad1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = ad1 + ad2;
}
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
    ab1 = !ab2;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    double ld0 = 978.3148493493825;
    ld0 = fd0 - fd1;
    Output.points[5][3] -= ld0;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    ab1 = ab2 || ab3;
    fd1 *= -1;
    ab4 = ld0 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fd0 = fo0.m3();
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
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    ad4 *= -1;
    boolean lb1 = true;
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(ao2 != null){
      ad3 = ao2.m3(lb0, lb1, ab1, ab2);
}
    ab3 = !ab4;
    Thought lo2 = Thought17.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
    boolean lb3 = false;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m3(fd0, fd1, ad1, ad2, lb3, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    lb1 = lb3 && ab1;
    Thought lo4 = Thought222.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ab2 = fo1.m2(ad3, ad4, fd0, fd1);
}
    boolean lb5 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    double ld6 = 157.1125250987315;
    double ld7 = 351.9754294574634;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 368.8201370942523;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought214.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb2);
}
    double ld3 = 586.2591758730786;
    fb0 = !fb1;
    fd0 = fd1 + ld0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || ab1;
    fd1 *= -1;
    double ld0 = 47.52643387744426;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    if (ab3) {
        ab4 = fb0 && fb1;
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld1 = 210.98667318432175;
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[5][4] += ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    double ld1 = 971.2295717106772;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought368.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld3 = 903.4467628333263;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = lb0 || ab1;
        ab2 = ab3 || ab4;
        Thought lo4 = Thought48.getInstance(ld1, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3);
}
        Thought lo5 = Thought77.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
        ab2 = ld1 > ad1;
        boolean lb6 = true;
        boolean lb7 = true;
        ab1 = ab2 && ab3;
        Output.points[5][5] += ad2;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = lb0 || fb0;
    Thought lo1 = Thought257.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought0.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    fd0 = fd1 + fd0;
    double ld3 = 612.9542189128148;
    double ld4 = 566.5552985759689;
if(ao2 != null){
      ao1 = ao2.m4(ld4, fd0, fd1, ld3, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ld4 = ao2.m3(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        }
    lb0 = fd0 > fd1;
    Thought lo5 = Thought389.getInstance(ld3, ld4, fd0, fd1);

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
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 > ad1;
    fb0 = ad2 > ad3;
    fb1 = !fb0;
    if (fb1) {
        } else if (fb0) {
        fb1 = fb0 && fb1;
        } else {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ad4 *= -1;
        Output.points[5][6] += fd0;
                fb0 = fd1 < ad1;
        ad2 = ad3 + ad4;
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
    ab2 = ab3 || ab4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || ab1;
    Thought lo0 = Thought153.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    ab2 = ab3 && ab4;
    fd1 *= -1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld1 = 633.6770796955217;
    fd0 *= -1;

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
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    if (ab3) {
        } else {
if(ao3 != null){
          ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        Thought lo1 = Thought325.getInstance(ad4, fd0, fd1, ad1);
        lb0 = !ab1;
        if (ab2) {
            if (ab3) {
if(ao3 != null){
                  ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
                  ao2 = ao3.m4();
}
                boolean lb2 = false;
                ab4 = fb0 || fb1;
                fd1 = ad1 - ad2;
if(ao4 != null){
                  ad3 = ao4.m3(lb2, lb0, ab1, ab2);
}
if(fo0 != null){
                  fo0.m1(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
                lb2 = ad2 > ad3;
                Output.points[5][7] -= ad4;
                Thought lo3 = Thought382.getInstance(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
                ad3 = ad4 + fd0;
}}}
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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought337.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd1 > fd0;
    double ld1 = 45.96524222633469;
    Output.points[5][8] += fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought199.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        boolean lb4 = false;
    boolean lb5 = true;
    lb5 = ld1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld1, fd0, fd1);
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
    fd0 *= -1;
    double ld0 = 167.73164755061038;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    boolean lb1 = false;
    Output.points[6][0] -= ld0;
        lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, lb1, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought187.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought287.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought292.getInstance();
    fb1 = !fb0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb3, fb0, fb1);
}
        lb3 = fb0 || fb1;
if(fo0 != null){
      lb3 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb3, fb0);
}
    double ld4 = 684.2725862593159;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo5 = Thought368.getInstance(ld4, fd0, fd1, ld4);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0);
}
    boolean lb6 = true;
    lb3 = lb6 || fb0;

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
