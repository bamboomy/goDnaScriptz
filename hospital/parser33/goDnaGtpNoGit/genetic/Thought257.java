package genetic;
import java.util.ArrayList;
class Thought257 extends Thought{
private static ArrayList<Thought257> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 54.62477965074539;
private double fd1 = 869.5752339179778;
private Thought fo0 = null;
private Thought fo1 = null;
Thought257 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought257 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought257 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought257 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought257 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought257 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought257 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought257 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought257 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought257 instance = new Thought257 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought257 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought257 instance = new Thought257 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought257 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought257 instance = new Thought257 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought257 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought257 instance = new Thought257 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought257 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought257 instance = new Thought257 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought257 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought257 instance = new Thought257 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought257 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought257 instance = new Thought257 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought257 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought257 instance = new Thought257 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought118.getInstance();
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought356.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    Output.points[0][3] -= fd0;
    Thought lo3 = Thought218.getInstance(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
    Thought lo4 = Thought381.getInstance(fo1, fo0, fo1, fo0);
    Thought lo5 = Thought67.getInstance(fd1, fd0, fd1, fd0);
    fb0 = !fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo6 = Thought304.getInstance();
    lb2 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb2, fb0, fb1);
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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 573.6976596425782;
    fb0 = !fb1;
    ld0 *= -1;
    Thought lo1 = Thought9.getInstance(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld2 = 257.9377759900261;
    double ld3 = 62.06347813760196;
    double ld4 = 741.9270129071954;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld2, ld3, ld4);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, ld4, fd0);
}
    fd1 = ld0 + ld2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb6 = true;
    ab4 = ld3 < ld4;
    fb0 = fb1 || lb5;
    boolean lb7 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, lb6, lb7, ab1, ab2);
}
    double ld8 = 376.24890898916095;
    Output.points[0][4] += ld3;
    ab3 = ab4 && fb0;
    Thought lo9 = Thought32.getInstance(ld4, ld8, fd0, fd1, fb1, lb5, lb6, lb7);

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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = ad2 < ad3;
    Thought lo0 = Thought211.getInstance(fo1, fo0, fo1, fo0);
        boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    Output.points[0][5] -= ad4;
    fd0 = fd1 - ad1;
    fb0 = !fb1;
    lb1 = fb0 && fb1;
    double ld2 = 273.609219153082;
    Thought lo3 = Thought48.getInstance(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
    fd0 = fd1 + ld2;
    fb0 = !fb1;
    Output.points[0][6] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    Thought lo4 = Thought183.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    boolean lb5 = false;
    fd1 = ld2 - ad1;
    lb5 = ad2 > ad3;
    double ld6 = 543.7044586714321;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
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
    double ld0 = 326.54661362326743;
    ld0 = ad1 - ad2;
    boolean lb1 = false;
    lb1 = ad3 > ad4;
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    lb1 = ad2 < ad3;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    ad4 = fd0 - fd1;
    boolean lb2 = true;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(ld0, ad1, ad2, ad3);
}
    lb2 = lb3 || lb4;
    Thought lo5 = Thought117.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);

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
    Thought lo0 = Thought389.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought287.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Output.points[0][7] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    if (fb1) {
        double ld2 = 512.2750583331361;
        fb0 = ld2 > fd0;
        fb1 = fd1 > ld2;
        boolean lb3 = true;
if(ao4 != null){
          ao4.m3(fd0, fd1, ld2, fd0);
}
        fd1 *= -1;
        ld2 *= -1;
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
    ad2 *= -1;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    Thought lo1 = Thought353.getInstance();
    ad2 = ad3 + ad4;
    double ld2 = 322.9009285617992;
    boolean lb3 = true;
if(ao1 != null){
      ao1.m3(lb0, lb3, fb0, fb1);
}
    lb0 = !lb3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2, fb0, fb1, lb0, lb3);
}
    fb0 = fb1 && lb0;
    lb3 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ad1, ad2, ad3, ad4, lb0, lb3, fb0, fb1);
}
    lb0 = !lb3;
    fd0 *= -1;
    Output.points[0][8] -= fd1;
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb3);
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
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
    fd0 = fd1 + fd0;
    Output.points[1][0] += fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought134.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought18.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    boolean lb2 = false;
    lb2 = !ab1;
    ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
    ab1 = fd1 > fd0;
    Thought lo3 = Thought255.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb2, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0);
}
    lb2 = !ab1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
    lb0 = !ab1;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, lb0, lb1, ab1);
}
    Thought lo2 = Thought237.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = lb0 || lb1;
    ab1 = ad1 < ad2;
        boolean lb3 = false;
    ab1 = !ab2;
    if (ab3) {
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
        for(int i0=0; i0<10; i0++){
            boolean lb4 = true;
            lb0 = lb1 || lb3;
            Thought lo5 = Thought58.getInstance(ao4, fo0, fo1, ao1);
            ab1 = !ab2;
            for(int i1=0; i1<10; i1++){
                double ld6 = 197.5074060229511;
                ad2 = ad3 + ad4;
                }
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
    Thought lo0 = Thought372.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 || fb0;
    double ld3 = 689.335208148323;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3, fb1, lb1, lb2, fb0);
}
    fd0 = fd1 - ld3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;

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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    if (lb0) {
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m3();
}
        for(int i0=0; i0<10; i0++){
            ab1 = !ab2;
            ab3 = fd0 > fd1;
            ab4 = fb0 && fb1;
if(fo1 != null){
              fd0 = fo1.m3(lb0, ab1, ab2, ab3);
}
            ab4 = fd1 < fd0;
            boolean lb1 = false;
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
              fo1.m2(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
              ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb0);
}
            ab1 = !ab2;
            boolean lb2 = true;
            ab2 = !ab3;
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
            Output.points[1][1] -= fd1;
            ab4 = !fb0;
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
            boolean lb3 = true;
if(fo1 != null){
              fo1.m1();
}
            boolean lb4 = true;
            Output.points[1][2] -= fd1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[1][3] += ad1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    lb0 = ad2 < ad3;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, lb2, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    Thought lo4 = Thought240.getInstance(fo1, fo0, fo1, fo0);
    fd1 = ad1 + ad2;
        Thought lo5 = Thought203.getInstance(ad3, ad4, fd0, fd1);

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
    ad1 = ad2 + ad3;
    ab2 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 440.82662992367915;
if(fo0 != null){
      ab3 = fo0.m2();
}
    ab4 = ad4 < fd0;
    double ld1 = 209.24750046724213;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fb0 = fb1 && ab1;
    fd1 = ld0 + ld1;
    Output.points[1][4] += ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    boolean lb3 = true;
    Thought lo4 = Thought113.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab4 = fo1.m2(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    boolean lb5 = false;
    double ld6 = 426.3164432319857;
    ab4 = ld1 < ld6;
if(fo1 != null){
      fo0 = fo1.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
if(ao1 != null){
      fd0 = ao1.m3(lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
if(ao2 != null){
      lb2 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
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
    fb0 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3();
}
    boolean lb0 = true;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb0);
}
    ad4 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
    boolean lb2 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab4 = fb0 && fb1;
    Thought lo1 = Thought329.getInstance(ao2, ao3, ao4, fo0);
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ao3.m3(lb0, ab1, ab2, ab3);
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
    ad1 *= -1;
    ab2 = ab3 || ab4;
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ad1 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    lb1 = !ab1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab3 = !ab4;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought305.getInstance(ad1, ad2, ad3, ad4);
    fb1 = lb0 && lb1;
    double ld3 = 738.5606334734802;
    Thought lo4 = Thought165.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3);
    boolean lb5 = false;
    boolean lb6 = true;
    Output.points[1][5] += ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(lb5, lb6, ab1, ab2);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ld3, ad1, ad2, ab3, ab4, fb0, fb1);
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
    double ld0 = 5.677831291412533;
    fb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought0.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    ld0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 503.8407551020465;
    ld2 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    ld0 = ld2 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ld2, fd0);
}
    fb1 = fd1 > ld0;
    boolean lb3 = false;
    Thought lo4 = Thought247.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
    boolean lb5 = false;
    boolean lb6 = false;
    lb3 = !lb5;
    boolean lb7 = true;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 949.5712376935874;
    double ld2 = 291.7524644265771;
if(fo1 != null){
      lb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1, lb0, ab1, ab2, ab3);
}
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        ld1 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        lb0 = ld2 < fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        lb3 = ld1 > ld2;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, ld2, fd0);
}
        ab1 = ab2 || ab3;
        fd1 = ld1 - ld2;
        ab4 = fd0 > fd1;
        Thought lo4 = Thought260.getInstance(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
        boolean lb5 = false;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    Output.points[1][6] += ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    fb1 = ad1 > ad2;
    Output.points[1][7] += ad3;
    fb0 = ad4 < fd0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fd1 < ad1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[1][8] -= ad2;
    Thought lo2 = Thought44.getInstance(fb0, fb1, lb0, lb1);
    double ld3 = 573.4242669421518;
    fb0 = ad2 < ad3;
    fb1 = lb0 && lb1;
    boolean lb4 = false;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, lb4, fb0, fb1, lb0);
}
        lb1 = lb4 && fb0;
        ad4 = fd0 + fd1;
        Output.points[2][0] -= ld3;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb4);
}
        fd1 *= -1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    for(int i0=0; i0<10; i0++){
        ab2 = fd1 < ad1;
        ab3 = ab4 || fb0;
        if (fb1) {
            ab1 = ad2 > ad3;
            } else {
            Thought lo0 = Thought69.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
                        Output.points[2][1] += ad2;
}}
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
    fb1 = fd1 > fd0;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      fd1 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought177.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    lb1 = !fb0;
    fb1 = lb1 && fb0;
    fb1 = !lb1;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought316.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fd1 *= -1;
    double ld3 = 354.53027908525524;
    fb0 = !fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[2][2] -= fd1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    Output.points[2][3] += ad1;
    boolean lb1 = true;
    lb0 = !lb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo2 = Thought253.getInstance(fb0, fb1, lb0, lb1);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao2.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought7.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
    fb0 = ad4 < fd0;
    fd1 = ad1 - ad2;
    boolean lb4 = false;
    boolean lb5 = false;
    boolean lb6 = true;
        ad3 = ad4 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    lb5 = lb6 && fb0;
    fb1 = lb0 || lb1;
    fd0 = fd1 + ad1;
    boolean lb7 = true;
    ad2 *= -1;
    lb4 = !lb5;
    lb6 = !lb7;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = fd1 > fd0;
    ab2 = !ab3;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    Thought lo1 = Thought315.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    ab1 = !ab2;
    ab3 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
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
    if (ab2) {
        ab3 = ab4 && fb0;
        boolean lb0 = true;
        } else {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Output.points[2][4] -= ad1;
        fb1 = ad2 < ad3;
        double ld1 = 940.9976914880759;
        ab1 = ad3 < ad4;
        Thought lo2 = Thought270.getInstance(fd0, fd1, ld1, ad1);
        Thought lo3 = Thought185.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
        boolean lb4 = false;
        Thought lo5 = Thought153.getInstance();
if(ao1 != null){
          fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2, fb0, fb1, lb4, ab1);
}
        double ld6 = 908.2341165081142;
        boolean lb7 = false;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        if (fb0) {
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb4, lb7, ab1);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
              ao3 = ao4.m4(fd1, ld1, ld6, ad1);
}
            Output.points[2][5] -= ad2;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
            ab2 = ab3 || ab4;
            } else {
}}
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
    fb0 = fd1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3();
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[2][6] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        double ld0 = 344.0945317881508;
        fb1 = !fb0;
        fd0 = fd1 + ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
    double ld2 = 435.52625616286457;
    fd0 = fd1 + ld2;
    ab2 = ab3 && ab4;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    Output.points[2][7] += fd1;
    fb1 = ad1 > ad2;
    double ld0 = 827.0727995422368;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought8.getInstance(fo0, fo1, fo0, fo1);
    lb1 = !fb0;
    fb1 = ad2 > ad3;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
    lb1 = lb3 || fb0;
    ad4 = fd0 + fd1;
    fb1 = !lb1;
    ld0 = ad1 - ad2;
    lb3 = !fb0;

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
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    Output.points[2][8] += ad2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab4 = fb0 || fb1;
    Thought lo2 = Thought6.getInstance();
    lb0 = lb1 || ab1;
    double ld3 = 270.4567770210033;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ld3 = ad1 + ad2;
    boolean lb4 = false;
    double ld5 = 720.4637122457393;
    double ld6 = 773.9933416861292;
    Thought lo7 = Thought270.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
    fd0 = fd1 + ld3;
    ld5 = ld6 + ad1;
    lb4 = ab1 || ab2;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld3 = ld5 - ld6;
    lb0 = ad1 < ad2;
    lb1 = !lb4;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    Output.points[3][0] -= fd1;
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought236.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    boolean lb2 = true;
    fd0 *= -1;
    boolean lb3 = false;
    lb2 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, lb3, fb0, fb1);
}
    lb0 = !lb2;
    lb3 = fb0 && fb1;
    lb0 = lb2 || lb3;
    fb0 = fd0 > fd1;

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
    fb0 = ad1 < ad2;
    boolean lb0 = true;
    ad3 *= -1;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[3][1] -= fd0;
    Output.points[3][2] += fd1;
    fb0 = ad1 > ad2;

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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought232.getInstance();
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    double ld2 = 121.8045008919547;
    ld2 *= -1;
    Thought lo3 = Thought195.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, lb1, ab1, ab2, ab3);
        Output.points[3][3] -= fd1;
    ld2 = fd0 + fd1;
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}

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
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
        ad3 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ab4 = fo0.m2(ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    ab3 = ab4 || fb0;
    Output.points[3][4] += fd1;
    double ld3 = 547.7500741048035;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = ld3 < ad1;
    lb0 = lb1 || lb2;
    Output.points[3][5] += ad2;
        Thought lo4 = Thought338.getInstance(ab1, ab2, ab3, ab4);
    ad3 = ad4 + fd0;
    fb0 = fb1 && lb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld3, ad1, ad2, ad3, lb1, lb2, ab1, ab2);
}
    ab3 = !ab4;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought320.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    lb1 = !fb0;
    boolean lb2 = true;
        fd1 *= -1;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb1, lb2);
}
    Output.points[3][6] += fd1;

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
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    double ld2 = 421.2308271524831;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    boolean lb3 = true;
    fd0 = fd1 + ld2;
    fb0 = fd0 < fd1;
    fb1 = lb0 || lb1;
    lb3 = !fb0;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld2;

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
    Thought lo0 = Thought392.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    double ld1 = 845.3301658310783;
    Output.points[3][7] -= ld1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m3(fd1, ld1, fd0, fd1, fb1, lb2, fb0, fb1);
}
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
    fb0 = ld1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb2, fb0, fb1);
}
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
}
