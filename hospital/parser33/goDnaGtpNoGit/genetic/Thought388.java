package genetic;
import java.util.ArrayList;
class Thought388 extends Thought{
private static ArrayList<Thought388> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 239.44415558906505;
private double fd1 = 367.61638228865553;
private Thought fo0 = null;
private Thought fo1 = null;
Thought388 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought388 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought388 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought388 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought388 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought388 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought388 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought388 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought388 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought388 instance = new Thought388 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought388 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought388 instance = new Thought388 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought388 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought388 instance = new Thought388 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought388 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought388 instance = new Thought388 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought388 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought388 instance = new Thought388 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought388 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought388 instance = new Thought388 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought388 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought388 instance = new Thought388 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought388 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought388 instance = new Thought388 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    double ld1 = 575.8646330985179;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
        fd0 = fd1 + ld1;
    boolean lb3 = false;
    fd0 = fd1 + ld1;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
    lb2 = ld1 < fd0;
    Thought lo4 = Thought64.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
    Thought lo5 = Thought219.getInstance();
    ld1 *= -1;
            lb3 = !fb0;
    boolean lb6 = true;
    boolean lb7 = false;
    fd0 *= -1;
    lb7 = !fb0;
    double ld8 = 373.7885808058975;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(lb0, lb2, lb3, lb6);
}
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[3][3] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
    Output.points[3][4] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ab1 = ab2 && ab3;

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
    boolean lb0 = false;
    Thought lo1 = Thought121.getInstance(fo0, fo1, fo0, fo1);
    lb0 = fb0 || fb1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    boolean lb2 = true;
if(fo1 != null){
      lb0 = fo1.m2();
}
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(lb2, lb3, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, lb2, lb3, fb0);
}
        fb1 = ad4 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb0, lb2, lb3, fb0);
}
        fb1 = !lb0;
        Thought lo4 = Thought53.getInstance(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
        lb0 = lb2 && lb3;
        boolean lb5 = true;
        Thought lo6 = Thought35.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
        }
    Thought lo7 = Thought390.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fb0 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3();
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
    boolean lb0 = false;
if(fo0 != null){
      ad1 = fo0.m3(lb0, ab1, ab2, ab3);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
    Thought lo1 = Thought270.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
    Thought lo3 = Thought221.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, lb2, ab1, ab2);
    double ld4 = 823.7754097926367;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld4, ad1, ab3, ab4, fb0, fb1);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    if (fb1) {
        fd1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        fb0 = fd1 < fd0;
        double ld0 = 683.5894046456742;
if(ao2 != null){
          ao2.m3();
}
        fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
        fd0 = fd1 + ld0;
        boolean lb1 = false;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb1, fb0);
}
        Output.points[3][5] += fd0;
        boolean lb2 = false;
        fd1 = ld0 - fd0;
        fb0 = fb1 && lb1;
        Thought lo3 = Thought316.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
if(ao4 != null){
          ao3 = ao4.m4(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb1);
}
        Output.points[3][6] += fd0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
        Thought lo4 = Thought152.getInstance(fd1, ld0, fd0, fd1);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
        lb2 = fb0 && fb1;
        fd0 = fd1 + ld0;
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
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought88.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought104.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
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
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          ab3 = fo1.m2();
}
        fd0 = fd1 + fd0;
        ab4 = !fb0;
if(ao1 != null){
          ao1.m1(fb1, ab1, ab2, ab3);
}
        fd1 = fd0 + fd1;
        ab4 = fb0 || fb1;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        fd0 = fd1 - fd0;
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        double ld0 = 72.7061423198664;
        ab2 = ab3 || ab4;
        fb0 = !fb1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        double ld1 = 187.9364649320333;
if(ao4 != null){
          ld1 = ao4.m3(ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought357.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb0, fb1, ab1, ab2);
        ab3 = fd0 > fd1;
        double ld3 = 744.7323028401362;
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
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab4 = ao2.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 > ad2;
    double ld0 = 176.7372373782945;
    double ld1 = 888.9351137237144;
    ab1 = ab2 && ab3;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ld0 *= -1;
    ld1 *= -1;
if(ao2 != null){
      ab4 = ao2.m2();
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = true;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, lb2, ab1);
}
    Output.points[3][7] += ld0;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    double ld3 = 226.60717906141232;
    double ld4 = 337.43117686223354;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld3, ld4, ad1, lb2, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
    Thought lo5 = Thought97.getInstance(fd0, fd1, ld0, ld1, ab4, fb0, fb1, lb2);

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought157.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought338.getInstance();
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    Output.points[3][8] -= fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought190.getInstance(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb4 = fd0 > fd1;
    if (fb0) {
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
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
    Thought lo0 = Thought129.getInstance(ab1, ab2, ab3, ab4);
    Thought lo1 = Thought93.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    boolean lb2 = false;
    boolean lb3 = false;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);
}
    double ld4 = 695.5762039791504;
    if (ab1) {
        double ld5 = 88.29185311552114;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        ld5 *= -1;
        double ld6 = 476.9539697193758;
        for(int i0=0; i0<10; i0++){
            ld6 = ld4 - fd0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            fd1 = ld5 - ld6;
            fb1 = ld4 < fd0;
            lb2 = lb3 || ab1;
            ab2 = ab3 && ab4;
if(fo0 != null){
              fd1 = fo0.m3(ld5, ld6, ld4, fd0);
}
            fb0 = fb1 || lb2;
}}
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
    Thought lo0 = Thought357.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fb0 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    Thought lo1 = Thought238.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    Output.points[4][0] -= ad1;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m2();
}
    fb0 = fb1 || lb2;
if(fo1 != null){
      ad3 = fo1.m3(fb0, fb1, lb2, fb0);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, lb2, lb3, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
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
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        double ld0 = 301.09460208527196;
        fd0 *= -1;
        fd1 = ld0 - ad1;
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
        fd1 *= -1;
        ab4 = !fb0;
        fb1 = ld0 > ad1;
        Output.points[4][1] -= ad2;
        ab1 = ad3 < ad4;
        Thought lo1 = Thought122.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
        fb1 = !ab1;
        boolean lb2 = true;
        fd0 *= -1;
        boolean lb3 = true;
        lb3 = fd1 > ld0;
        ab1 = !ab2;
        ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
        ab3 = ab4 && fb0;
        ld0 = ad1 - ad2;
        fb1 = lb2 && lb3;
        ab1 = ab2 || ab3;
        ad3 *= -1;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld0, ad1);
}
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
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought386.getInstance();
    Output.points[4][2] -= fd1;
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
    Output.points[4][3] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought100.getInstance();
    boolean lb3 = false;
    boolean lb4 = false;
    lb4 = fd0 < fd1;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb1, lb3, lb4);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb1, lb3, lb4);
}
    Output.points[4][4] += fd0;
    fd1 *= -1;

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
    ad1 *= -1;
    boolean lb0 = true;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
        boolean lb2 = true;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought335.getInstance(ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ad4 = ao2.m3(fb0, fb1, lb0, lb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 525.8365158420887;
    ab2 = ld0 > fd0;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld0;
    fb0 = fb1 || ab1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    Thought lo1 = Thought325.getInstance(ao2, ao3, ao4, fo0);
    Thought lo2 = Thought123.getInstance(fd1, ld0, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    fb1 = fd0 > fd1;
    ab1 = ab2 && ab3;

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
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        boolean lb0 = true;
if(ao2 != null){
          ao2.m3();
}
        boolean lb1 = true;
        Thought lo2 = Thought195.getInstance(lb0, lb1, ab1, ab2);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        ad2 = ad3 - ad4;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ad1, ad2, lb0, lb1, ab1, ab2);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    for(int i1=0; i1<10; i1++){
        Thought lo3 = Thought82.getInstance(fo0, fo1, ao1, ao2);
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
    fb1 = fd0 < fd1;
    fd0 *= -1;
    Thought lo0 = Thought126.getInstance(fd1, fd0, fd1, fd0);
    Output.points[4][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    Output.points[4][6] += fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    lb1 = lb2 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb1, lb2, fb0);
}
    fb1 = fd0 > fd1;
    lb1 = fd0 > fd1;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
    lb1 = fd0 > fd1;
    double ld4 = 591.8446626922016;
if(fo1 != null){
      lb2 = fo1.m2(ld4, fd0, fd1, ld4, lb3, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
    fd0 = fd1 - ld4;
    Thought lo5 = Thought385.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - ld4;
    if (lb1) {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld4, fd0);
}
        lb2 = lb3 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1);
}
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          fo1.m3(fb1, lb1, lb2, lb3);
}
        Output.points[4][7] -= ld4;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 696.4013142704903;
    ld0 *= -1;
    boolean lb1 = true;
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    Thought lo2 = Thought89.getInstance(fd1, ld0, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(lb1, ab1, ab2, ab3);
}
    boolean lb3 = true;
        boolean lb4 = true;
    double ld5 = 321.72415309931466;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    Output.points[4][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2();
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought82.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fd0 = fd1 - ad1;
    fb1 = !ab1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    Thought lo2 = Thought202.getInstance(ad2, ad3, ad4, fd0);
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab4 = fb0 && fb1;
    double ld3 = 123.64169629232705;

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
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = !fb0;
    boolean lb0 = true;
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    double ld1 = 564.5854430004733;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd1 = ao4.m3(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
}
    boolean lb2 = true;
if(ao4 != null){
      ao4.m1();
}
    ld1 = fd0 - fd1;
    fb0 = !fb1;
        lb0 = lb2 || fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    boolean lb1 = false;
    boolean lb2 = true;
    fd0 *= -1;
    double ld3 = 356.66689400262084;
    Thought lo4 = Thought167.getInstance(lb1, lb2, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld3, ad1, lb0, lb1, lb2, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
    double ld5 = 775.9711872475888;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb2 = ao1.m2(ld3, ld5, ad1, ad2);
}
    double ld6 = 713.82905053605;
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld3, ld5);
}
    boolean lb7 = true;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return ld6;
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
        fb0 = !fb1;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
    fd1 = fd0 + fd1;
    Output.points[5][0] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    double ld2 = 607.3464870842347;
if(ao4 != null){
      ao4.m2(ld2, fd0, fd1, ld2, lb1, ab1, ab2, ab3);
}
    boolean lb3 = false;

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
    Output.points[5][1] -= ad1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab1 = ad1 < ad2;
    ab2 = !ab3;
    boolean lb0 = true;
    boolean lb1 = true;
    ab2 = ab3 || ab4;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m2(ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb1, lb2, ab1, ab2);
}
    Thought lo3 = Thought245.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, lb2, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb4 = true;
    Thought lo5 = Thought345.getInstance(ao3, ao4, fo0, fo1);
    boolean lb6 = true;
    Thought lo7 = Thought87.getInstance(fd0, fd1, ad1, ad2);
    ab3 = !ab4;
    Thought lo8 = Thought79.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = ad1 < ad2;
        }
    fb1 = lb0 && lb1;

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
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[5][2] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    lb0 = fd1 > fd0;
    double ld1 = 451.2037568835508;
    fb0 = fd0 < fd1;
    ld1 = fd0 + fd1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    lb3 = fd0 > fd1;
    fb0 = !fb1;
    boolean lb4 = false;
    lb0 = ld1 < fd0;
    lb2 = lb3 && lb4;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo5 = Thought292.getInstance(lb2, lb3, lb4, fb0);

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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || lb0;
    lb1 = fd1 > fd0;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb2 = ab1 || ab2;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        }
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
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
    ad1 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    double ld0 = 264.100811191532;
    Output.points[5][3] += ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought40.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought386.getInstance(ad3, ad4, fd0, fd1);
    Output.points[5][4] -= ad1;
        ab2 = ad2 < ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    double ld1 = 906.7422755201744;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    Output.points[5][5] -= fd0;
    Thought lo2 = Thought390.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    fd1 *= -1;
    fb1 = ld1 > ad1;
    boolean lb3 = true;
    lb3 = ab1 || ab2;
    ab3 = ad2 < ad3;
    ab4 = fb0 && fb1;

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
        fd0 = fd1 + fd0;
    fd1 *= -1;
    double ld0 = 60.4672028410411;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
    Thought lo1 = Thought248.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao1 != null){
      ao1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[5][6] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = ad3 > ad4;
    fd0 = fd1 - ad1;
    fb0 = !fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m3(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Output.points[5][7] -= ad4;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ad3 = ao3.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought21.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    boolean lb1 = true;

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
    Output.points[5][8] -= fd1;
    double ld0 = 58.23935171462164;
    ld0 *= -1;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[6][0] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    ld0 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    double ld1 = 424.68156691440106;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, fd0, fd1);
}
    ld0 *= -1;
    ld1 = fd0 + fd1;

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
    boolean lb0 = true;
    Output.points[6][1] += ad1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    fd1 *= -1;
    double ld2 = 639.5615013737686;
    ld2 *= -1;
if(ao1 != null){
      ad1 = ao1.m3();
}
    Thought lo3 = Thought235.getInstance(lb0, lb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb4 = false;
if(ao2 != null){
      ao2.m2(fd1, ld2, ad1, ad2, lb0, lb1, lb4, ab1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought158.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd0 < fd1;
    Output.points[6][2] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(lb0, fb0, fb1, lb0);
}
    double ld2 = 252.5700103091617;
    fb0 = !fb1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb3 = true;
    Thought lo4 = Thought89.getInstance(fd1, ld2, fd0, fd1, lb3, fb0, fb1, lb0);
    lb3 = !fb0;
    double ld5 = 512.0543917383534;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld5, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld2, ld5, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
        boolean lb6 = false;
    Thought lo7 = Thought222.getInstance(fb0, fb1, lb0, lb3);

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
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[6][3] -= fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb1 = fd0 > fd1;
    Output.points[6][4] += fd0;
    double ld0 = 641.6480903160028;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
        lb1 = fb0 && fb1;

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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    Thought lo2 = Thought282.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb0 = lb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
