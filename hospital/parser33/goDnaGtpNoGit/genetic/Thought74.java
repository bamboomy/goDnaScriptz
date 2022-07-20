package genetic;
import java.util.ArrayList;
class Thought74 extends Thought{
private static ArrayList<Thought74> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 374.97461149670926;
private double fd1 = 806.5372489613671;
private Thought fo0 = null;
private Thought fo1 = null;
Thought74 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought74 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought74 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought74 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought74 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought385.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought228.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb2;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo3 = Thought84.getInstance(fb1, lb2, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
    boolean lb4 = true;

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
    boolean lb0 = false;
    ab1 = fd0 < fd1;
    fd0 *= -1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = !ab1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
    double ld1 = 576.311185152551;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 805.5976442523536;
    Thought lo3 = Thought200.getInstance(ld2, fd0, fd1, ld1);
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1);
}
if(fo0 != null){
      ld2 = fo0.m3();
}
    Output.points[7][7] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    double ld4 = 602.0996760214391;
    ab3 = ab4 || fb0;
    fb1 = ld1 > ld2;
    ld4 = fd0 - fd1;

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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
    Thought lo2 = Thought210.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
    Thought lo3 = Thought125.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = !lb0;
    lb1 = fb0 || fb1;
    fd1 = ad1 + ad2;
    boolean lb4 = false;
    lb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = lb4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb1, lb4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, lb1, lb4, fb0);
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
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought108.getInstance(fo0, fo1, fo0, fo1);
    ab3 = fd0 > fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    ab2 = ab3 && ab4;
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
    fb1 = fd0 < fd1;
    lb1 = ad1 < ad2;
    Thought lo3 = Thought95.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb2 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      ab1 = fo0.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = ad4 > fd0;
    fb0 = fb1 || lb1;
if(fo0 != null){
      lb2 = fo0.m2(fd1, ad1, ad2, ad3);
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
    Thought lo0 = Thought383.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + fd0;
        fb0 = fd1 < fd0;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        boolean lb1 = true;
        lb1 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fd1 = fd0 + fd1;
if(ao2 != null){
          ao2.m1(fd0, fd1, fd0, fd1);
}
        lb1 = !fb0;
        fb1 = lb1 || fb0;
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
    fb0 = ad1 > ad2;
    Thought lo0 = Thought70.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fb1 = fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    Thought lo1 = Thought68.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    double ld2 = 824.0928784854127;
    double ld3 = 447.2388746303747;
    Thought lo4 = Thought394.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    if (fb1) {
        ad4 = fd0 + fd1;
        boolean lb5 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        double ld6 = 443.333884355495;
        ld6 = ld2 + ld3;
        boolean lb7 = true;
        lb5 = ad1 < ad2;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ld6);
}
        boolean lb8 = false;
        ld2 *= -1;
        ld3 = ad1 + ad2;
        boolean lb9 = true;
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
    ab2 = !ab3;
    Thought lo0 = Thought134.getInstance(ab4, fb0, fb1, ab1);
    double ld1 = 110.43984181576235;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
    Output.points[7][8] += ld1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
if(ao2 != null){
      ab2 = ao2.m2(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought248.getInstance(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
    ab4 = fd0 > fd1;
    Thought lo1 = Thought332.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
    for(int i0=0; i0<10; i0++){
        ab3 = ad1 < ad2;
        ad3 = ad4 + fd0;
        fd1 *= -1;
        ad1 *= -1;
        for(int i1=0; i1<10; i1++){
            ab4 = fb0 && fb1;
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
              ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
            ad1 = ad2 - ad3;
            ab1 = ad4 > fd0;
            boolean lb2 = false;
            ab1 = fd1 > ad1;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
              fd1 = ao3.m3();
}
if(fo0 != null){
              ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
            ad1 *= -1;
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
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    Thought lo0 = Thought99.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought213.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    Thought lo3 = Thought305.getInstance(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
    fd1 = fd0 - fd1;
    double ld4 = 652.1212128715398;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ld4, fd0, fd1, ld4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 976.4070169333216;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;
    Thought lo3 = Thought98.getInstance(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = ld0 > fd0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, lb2, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = !ab3;
    ld0 = fd0 - fd1;
    ab4 = ld0 > fd0;
    Thought lo4 = Thought35.getInstance(fd1, ld0, fd0, fd1);
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m3();
}
    lb1 = lb2 || lb5;
    boolean lb6 = false;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 902.6357857792574;
    ad2 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = ad4 > fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb1 = fb0 || fb1;
if(fo0 != null){
          fd1 = fo0.m3(ld0, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
        fb0 = ad4 > fd0;
        double ld1 = 969.1105341076491;
if(fo1 != null){
          fb1 = fo1.m2();
}
        fb0 = fb1 || fb0;
        Thought lo2 = Thought328.getInstance(fb1, fb0, fb1, fb0);
        fd0 = fd1 + ld1;
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
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    ab1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ab2 = !ab3;
    boolean lb0 = false;
    ab3 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
}
    boolean lb2 = false;
    Thought lo3 = Thought61.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    boolean lb4 = true;

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
    Output.points[8][0] -= fd1;
    Thought lo0 = Thought214.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        }
        fb0 = fd0 > fd1;
    Thought lo1 = Thought274.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld2 = 348.9253240760298;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;

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
    ad1 *= -1;
    Thought lo0 = Thought373.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    Thought lo1 = Thought61.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
    fb1 = fb0 || fb1;
    Thought lo2 = Thought179.getInstance();
    ad1 = ad2 + ad3;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
        fb0 = ad2 < ad3;
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        fb1 = ad2 > ad3;
        double ld3 = 170.31251746991114;
        boolean lb4 = true;
if(ao2 != null){
          lb4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb4, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ab2 = fd1 < fd0;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        ab3 = !ab4;
        }
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    ab4 = fd1 < fd0;
    Thought lo1 = Thought377.getInstance(fd1, fd0, fd1, fd0);
    Output.points[8][1] += fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
    Output.points[8][2] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, ab1);
}
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    double ld2 = 593.4997762126893;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld2, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = ld2 - fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
    boolean lb3 = false;
    fd1 *= -1;
    double ld4 = 390.94729146658534;
    double ld5 = 867.1260628180012;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld2 = ld4 - ld5;
    if (lb3) {
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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
    double ld1 = 691.2669797071749;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    double ld3 = 351.0987678849266;
    lb2 = ab1 && ab2;
if(ao3 != null){
      ab3 = ao3.m2();
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
    Output.points[8][3] += fd0;
    Thought lo0 = Thought145.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fb0 = fd1 < fd0;
    Thought lo2 = Thought2.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
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
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    Output.points[8][4] += fd0;
    boolean lb1 = true;
if(fo1 != null){
      ab2 = fo1.m2(fd1, fd0, fd1, fd0);
}
    double ld2 = 560.9416182610776;
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    double ld3 = 86.16809467689855;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld3 = fd0 + fd1;
    Output.points[8][5] -= ld2;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(lb0, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Thought lo0 = Thought115.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo0 != null){
          fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought49.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    fb1 = ad3 > ad4;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = ad2 < ad3;
    ad4 = fd0 + fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    Output.points[8][6] += ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ab4 = fb0 || fb1;
    Output.points[8][7] -= ad2;
    ad3 *= -1;
    lb0 = !ab1;
    ad4 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    double ld1 = 615.9193609708217;

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
    fb0 = !fb1;
    double ld0 = 741.1464200240364;
    ld0 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, fd0, fd1);
}
    double ld1 = 268.90389285162473;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1);
}
    Thought lo2 = Thought163.getInstance();
    ld0 = ld1 + fd0;
    fd1 = ld0 - ld1;
    Output.points[8][8] -= fd0;
    Output.points[0][0] += fd1;
    ld0 = ld1 - fd0;
    fb1 = !fb0;
    double ld3 = 376.1998914593835;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld3, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(ao1 != null){
          ld3 = ao1.m3(ao2, ao3, ao4, fo0);
}
        double ld4 = 252.81415249580928;
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
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < ad1;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    lb1 = fd1 > ad1;
    fb0 = ad2 > ad3;
    fb1 = lb0 || lb1;

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
    ab1 = fd0 < fd1;
    boolean lb0 = false;
    double ld1 = 554.284875225979;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
    if (ab4) {
        double ld2 = 616.3417784391557;
        fb0 = ld1 < fd0;
if(ao2 != null){
          ao2.m3();
}
        boolean lb3 = true;
        boolean lb4 = false;
        ab4 = fd1 > ld2;
if(ao3 != null){
          ld1 = ao3.m3(fb0, fb1, lb3, lb4);
}
        if (lb0) {
if(ao4 != null){
              ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld1, ab1, ab2, ab3, ab4);
}
            fd0 = fd1 - ld2;
            fb0 = ld1 > fd0;
if(ao3 != null){
              fd1 = ao3.m3(ld2, ld1, fd0, fd1, fb1, lb3, lb4, lb0);
}
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
            Output.points[0][1] += ld2;
            Thought lo5 = Thought324.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
              ao2 = ao3.m4(ld1, fd0, fd1, ld2);
}
if(ao4 != null){
              ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld1);
}
if(ao3 != null){
              ao3.m3();
}
            fd0 *= -1;
            fd1 = ld2 - ld1;
            fd0 *= -1;
if(ao4 != null){
              fb0 = ao4.m2(fb1, lb3, lb4, lb0);
}
if(fo0 != null){
              fo0.m3(fo1, ao1, ao2, ao3, fd1, ld2, ld1, fd0, ab1, ab2, ab3, ab4);
}
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought17.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld1 = 89.79958697274836;
    Thought lo2 = Thought340.getInstance(fd0, fd1, ld1, ad1);
    boolean lb3 = true;
    double ld4 = 154.81459416513943;
    ad1 = ad2 - ad3;
    double ld5 = 249.9951698494316;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      ao2.m1(fb1, lb3, ab1, ab2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    Output.points[0][2] += fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    boolean lb1 = true;
    Output.points[0][3] += fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    ad2 = ad3 - ad4;
    Output.points[0][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 571.0330205042949;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb3, lb0);
}
        }
    fb0 = fb1 || lb0;
    lb1 = !fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld2, ad1, ad2, ad3);
}
    for(int i1=0; i1<10; i1++){
        lb1 = ad4 < fd0;
        Output.points[0][5] += fd1;
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
    Output.points[0][6] -= ad1;
    ad2 *= -1;
    boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fb1 = lb0 || ab1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    ab4 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb3 = false;
if(fo1 != null){
      ad3 = fo1.m3();
}
    boolean lb4 = false;
    ab3 = ad4 > fd0;
    Thought lo5 = Thought37.getInstance(ab4, fb0, fb1, lb0);
    boolean lb6 = false;

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
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 < fd1;
    boolean lb1 = true;
    Thought lo2 = Thought300.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, lb1, fb0);
}
    fb1 = fd0 < fd1;
        Thought lo3 = Thought178.getInstance(ao1, ao2, ao3, ao4);
    Output.points[0][7] -= fd0;
    boolean lb4 = true;
    double ld5 = 852.3531970947814;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld5, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    fb0 = !fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld0 = 650.3108688793163;
if(ao1 != null){
      fb1 = ao1.m2();
}
    Thought lo1 = Thought149.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought255.getInstance(ld0, ad1, ad2, ad3);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3();
}
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        fb0 = ad3 > ad4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][8] += fd1;
    ab1 = fd0 > fd1;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    Output.points[1][0] += fd0;
    ab1 = fd1 > fd0;
    boolean lb0 = false;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fb1 = lb0 || ab1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
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
    ab2 = ab3 && ab4;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || ab1;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ad1 = ao2.m3(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ab4 = fb0 || fb1;
    ad2 *= -1;
    lb0 = lb1 && ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought287.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, lb1, ab1);
    if (ab2) {
        Thought lo3 = Thought7.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
        Output.points[1][1] += fd0;
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
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      lb0 = fo1.m2(lb1, fb0, fb1, lb0);
}
    double ld2 = 378.84768221693815;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}
    fd1 *= -1;
    ld2 *= -1;
    boolean lb3 = true;
    double ld4 = 995.0507185860935;
if(fo1 != null){
      ld4 = fo1.m3(fd0, fd1, ld2, ld4, lb1, lb3, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, lb3, fb0);
}
    Thought lo5 = Thought327.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, ld4, fd0);
}
    Output.points[1][2] += fd1;

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
    double ld0 = 882.4170443166963;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    fb0 = fb1 && fb0;
        Output.points[1][3] -= fd0;
    Output.points[1][4] += fd1;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    double ld1 = 198.72415756974428;
    Output.points[1][5] += ld1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
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
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[1][6] -= fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    double ld2 = 146.26857525866632;
    double ld3 = 166.55367124451803;
    Output.points[1][7] += ld2;

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
